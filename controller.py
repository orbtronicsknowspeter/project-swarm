"""
Combined KCBUS & WebRTC Streamer
Integrates a bit-banged 2-bit GPIO protocol, keyboard controls, and 
an aiortc H.264 video streaming server.
"""

import asyncio
import select
import sys
import termios
import time
import tty
import json
from collections import deque

from aiohttp import web
from aiortc import RTCPeerConnection, RTCSessionDescription, RTCConfiguration, RTCIceServer, VideoStreamTrack
from av import VideoFrame
from picamera2 import Picamera2
from gpiozero import DigitalInputDevice, OutputDevice

# ==========================================================
# KCBUS: Custom 2-bit parallel bus
# ==========================================================

class KCBUS:
    BUFFER_MAX          = 5
    POLL_YIELD          = 0        
    READ_TIMEOUT_YIELDS = 100_000  

    def __init__(self, read_pins: list[int], write_pins: list[int], input_clk: int, output_clk: int, output_clk_freq: float, input_state_pin: int, output_state_pin: int):
        if len(read_pins) != 2 or len(write_pins) != 2:
            raise ValueError("read_pins and write_pins must each have exactly 2 entries.")

        self.buffer: deque[int] = deque(maxlen=self.BUFFER_MAX)

        self.read_pins       = [DigitalInputDevice(pin) for pin in read_pins]
        self.input_clk       = DigitalInputDevice(input_clk)
        self.input_state_pin = DigitalInputDevice(input_state_pin)

        self.write_pins       = [OutputDevice(pin, initial_value=False, active_high=True) for pin in write_pins]
        self.output_state_pin = OutputDevice(output_state_pin, initial_value=False, active_high=True)
        self.output_clk       = OutputDevice(output_clk, initial_value=False, active_high=True)
        self.output_clk_freq  = output_clk_freq

    async def read(self) -> int:
        data, bit_position, prev_clock, yields = 0, 0, self.input_clk.value, 0
        while self.input_state_pin.value:
            curr_clock = self.input_clk.value
            if curr_clock and not prev_clock:
                for pin in reversed(self.read_pins):
                    data = (data << 1) | pin.value
                bit_position += len(self.read_pins)
            prev_clock = curr_clock
            await asyncio.sleep(self.POLL_YIELD)
            yields += 1
            if yields >= self.READ_TIMEOUT_YIELDS: break  
        return data

    async def write(self, data: int, bit_length: int) -> None:
        if bit_length % len(self.write_pins) != 0: raise ValueError("bit_length error")
        remaining = bit_length
        try:
            clock_state = self.input_clk.value 
            prev_clock = clock_state
            while remaining > 0:
                self.output_state_pin.on()
                clock_state = self.input_clk.value
                if not clock_state and prev_clock:
                    for i, pin in enumerate(reversed(self.write_pins)):
                        bit_index = remaining - 1 - i
                        pin.value = (data >> bit_index) & 0x01 if bit_index >= 0 else 0
                    remaining -= len(self.write_pins)
                prev_clock = clock_state
                await asyncio.sleep(self.POLL_YIELD)
                
            while not self.input_clk.value: await asyncio.sleep(self.POLL_YIELD) 
            self.output_state_pin.off()
        finally:
            while self.input_clk.value: await asyncio.sleep(self.POLL_YIELD)
            self.output_state_pin.off()
            self.output_clk.off()
            for pin in self.write_pins: pin.off()

    def ready_to_read(self) -> bool:
        return bool(self.input_state_pin.value)

    def get_data_from_buffer(self, latest_only: bool = False):
        if latest_only: return self.buffer[-1] if self.buffer else None
        return self.buffer[0]

    def close(self) -> None:
        for p in self.read_pins + self.write_pins + [self.input_clk, self.input_state_pin, self.output_state_pin]: p.close()

    async def loop(self) -> None:
        while True:
            if self.ready_to_read():
                self.buffer.append(await self.read())
            else:
                await asyncio.sleep(self.POLL_YIELD)

# ==========================================================
# KEYBOARD INPUT HELPERS
# ==========================================================
def _read_char(timeout: float = 0.1) -> str | None:
    fd = sys.stdin.fileno()
    ready, _, _ = select.select([fd], [], [], timeout)
    return sys.stdin.read(1) if ready else None

def _read_keypress(timeout: float = 0.1) -> str | None:
    first = _read_char(timeout)
    if not first: return None
    if first != "\x1b":
        if first == "\x03": return "CTRL_C"
        if first.lower() == "q": return "QUIT"
        return first.upper()
    escape_map = {"A": "UP", "B": "DOWN", "C": "RIGHT", "D": "LEFT"}
    if _read_char(0.05) != "[": return None
    third = _read_char(0.05)
    if third in escape_map: return escape_map[third]
    if third != "1" or _read_char(0.05) != ";": return None
    modifier, arrow = _read_char(0.05), _read_char(0.05)
    return f"SHIFT_{escape_map[arrow]}" if modifier == "2" and arrow in escape_map else None

def _compute_wheel_speeds(active_keys: set[str]) -> tuple[int, int] | None:
    boost = "SHIFT" in active_keys
    base, turn = (90, 35) if boost else (50, 25)
    fwd, left, right, stop = "UP" in active_keys, "LEFT" in active_keys, "RIGHT" in active_keys, "DOWN" in active_keys
    if fwd: return (max(0, base - turn), min(127, base + turn)) if left else (min(127, base + turn), max(0, base - turn)) if right else (base, base)
    if left: return (0, base)
    if right: return (base, 0)
    if stop: return (0, 0)
    return None

def _set_terminal_raw_mode() -> tuple:
    fd = sys.stdin.fileno()
    old_settings = termios.tcgetattr(fd)
    tty.setcbreak(fd)
    return old_settings

# ==========================================================
# CAMERA & WEBRTC SETUP
# ==========================================================
INDEX_HTML = """
<!DOCTYPE html>
<html><head><title>Pi Camera Stream</title></head><body>
<h2>Raspberry Pi WebRTC Stream</h2>
<video id="video" autoplay playsinline muted style="width: 100%; max-width: 800px;"></video>
<script>
const pc = new RTCPeerConnection({ iceServers: [{ urls: "stun:stun.l.google.com:19302" }] });
pc.addTransceiver("video", { direction: "recvonly" });
pc.ontrack = (event) => { document.getElementById("video").srcObject = event.streams[0]; };
async function start() {
    const offer = await pc.createOffer();
    await pc.setLocalDescription(offer);
    const response = await fetch("/offer", {
        method: "POST", headers: {"Content-Type": "application/json"},
        body: JSON.stringify({ sdp: pc.localDescription.sdp, type: pc.localDescription.type })
    });
    const answer = await response.json();
    await pc.setRemoteDescription(answer);
}
start();
</script></body></html>
"""

pcs = set()
picam2 = Picamera2()
config = picam2.create_video_configuration(main={"size": (1280, 720), "format": "RGB888"})
picam2.configure(config)
picam2.start()

class CameraVideoTrack(VideoStreamTrack):
    async def recv(self):
        await asyncio.sleep(1 / 30)
        pts, time_base = await self.next_timestamp()
        
        # --- OPTIMIZATION: Threaded Camera Capture ---
        # Prevents frame grabs from freezing the KCBUS background loop!
        loop = asyncio.get_running_loop()
        frame = await loop.run_in_executor(None, picam2.capture_array, "main")
        
        video_frame = VideoFrame.from_ndarray(frame, format="bgr24")
        video_frame.pts, video_frame.time_base = pts, time_base
        return video_frame

async def offer(request):
    params = await request.json()
    offer = RTCSessionDescription(sdp=params["sdp"], type=params["type"])
    pc = RTCPeerConnection(configuration=RTCConfiguration(iceServers=[RTCIceServer(urls=["stun:stun.l.google.com:19302"])]))
    pcs.add(pc)
    print("New WebRTC connection created\r")

    @pc.on("connectionstatechange")
    async def on_connectionstatechange():
        print(f"Connection state: {pc.connectionState}\r")
        if pc.connectionState in ("failed", "closed", "disconnected"):
            await pc.close()
            pcs.discard(pc)

    pc.addTrack(CameraVideoTrack())
    await pc.setRemoteDescription(offer)
    answer = await pc.createAnswer()
    await pc.setLocalDescription(answer)
    return web.Response(content_type="application/json", text=json.dumps({"sdp": pc.localDescription.sdp, "type": pc.localDescription.type}))

async def index(request): return web.Response(text=INDEX_HTML, content_type="text/html")


# ==========================================================
# BACKGROUND TASKS & LIFECYCLE
# ==========================================================
bus_instance = None
terminal_settings = None
background_tasks = []

async def send_wheel_speeds(left_speed: int, right_speed: int):
    await bus_instance.write(left_speed, bit_length=16)
    await asyncio.sleep(0.02)
    await bus_instance.write(128 + right_speed, bit_length=16)

async def control_with_keyboard():
    global terminal_settings
    print("Use arrow keys to control the robot. Press q or Ctrl-C to quit.\r")
    terminal_settings = _set_terminal_raw_mode()
    key_timestamps: dict[str, float] = {}
    loop = asyncio.get_running_loop()
    
    try:
        while True:
            # Non-blocking terminal read via Thread Executor
            key = await loop.run_in_executor(None, _read_keypress, 0.1)
            now = time.monotonic()

            if key in {"QUIT", "CTRL_C"}: 
                # If they quit, we must trigger server shutdown cleanly
                loop.create_task(shutdown_server()) 
                break
                
            if key:
                if key.startswith("SHIFT_"):
                    key_timestamps["SHIFT"] = now
                    key_timestamps[key[len("SHIFT_"):]] = now
                elif key in {"UP", "DOWN", "LEFT", "RIGHT"}:
                    key_timestamps[key] = now

            # Cull old key presses
            key_timestamps = {k: ts for k, ts in key_timestamps.items() if now - ts <= 0.25}
            speeds = _compute_wheel_speeds(set(key_timestamps))
            
            if speeds: await send_wheel_speeds(speeds[0], speeds[1])
            else: await send_wheel_speeds(0, 0)
    finally:
        if terminal_settings: termios.tcsetattr(sys.stdin.fileno(), termios.TCSADRAIN, terminal_settings)

async def display_received_data():
    while True:
        latest = bus_instance.get_data_from_buffer(latest_only=True)
        if latest is not None: print(f"Received: {latest}\r")
        await asyncio.sleep(2)

async def start_background_tasks(app):
    global bus_instance
    bus_instance = KCBUS(read_pins=[5, 6], write_pins=[23, 24], input_clk=13, output_clk=25, output_clk_freq=0.1, input_state_pin=19, output_state_pin=16)
    
    # Store references to tasks so they don't get garbage collected
    background_tasks.append(asyncio.create_task(bus_instance.loop()))
    background_tasks.append(asyncio.create_task(control_with_keyboard()))
    background_tasks.append(asyncio.create_task(display_received_data()))

async def cleanup_background_tasks(app):
    if terminal_settings: termios.tcsetattr(sys.stdin.fileno(), termios.TCSADRAIN, terminal_settings)
    for task in background_tasks: task.cancel()
    if bus_instance: bus_instance.close()
    await asyncio.gather(*[pc.close() for pc in pcs])
    pcs.clear()

async def shutdown_server():
    """Allows quitting from the raw terminal to trigger an aiohttp shutdown."""
    raise KeyboardInterrupt

# ==========================================================
# SERVER START
# ==========================================================
if __name__ == "__main__":
    app = web.Application()
    app.router.add_get("/", index)
    app.router.add_post("/offer", offer)
    
    # Attach setup/teardown events safely
    app.on_startup.append(start_background_tasks)
    app.on_cleanup.append(cleanup_background_tasks)

    # Note: Prints might look weird due to Raw Terminal mode on startup
    print("Starting Web Server at http://0.0.0.0:8080...")
    web.run_app(app, host="0.0.0.0", port=8080)
