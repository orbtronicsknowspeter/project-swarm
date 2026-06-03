"""
Raspberry Pi WebRTC Streamer + Arduino Uno Commander
"""

import asyncio
import select
import sys
import termios
import time
import tty
import json
import serial

from aiohttp import web
from aiortc import RTCPeerConnection, RTCSessionDescription, RTCConfiguration, RTCIceServer, VideoStreamTrack
from av import VideoFrame
from picamera2 import Picamera2

# ==========================================================
# SERIAL SETUP TO ARDUINO UNO
# ==========================================================
# An Arduino Uno usually shows up as /dev/ttyACM0 or /dev/ttyUSB0
SERIAL_PORT = "/dev/ttyACM0" 
BAUD_RATE = 115200

try:
    uno_serial = serial.Serial(SERIAL_PORT, BAUD_RATE, timeout=0)
    # CRITICAL: Arduino Unos reset when serial opens. We must wait 2 seconds.
    print("Opening serial... waiting 2 seconds for Arduino to reboot.")
    time.sleep(2) 
except serial.SerialException as e:
    print(f"Error opening Serial Port {SERIAL_PORT}. Is the Uno plugged in?")
    uno_serial = None

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

    @pc.on("connectionstatechange")
    async def on_connectionstatechange():
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
# BACKGROUND TASKS
# ==========================================================
terminal_settings = None
background_tasks = []

def send_wheel_speeds_serial(left_speed: int, right_speed: int):
    """Sends target speeds to the Arduino Uno over USB."""
    if uno_serial:
        command = f"W:{left_speed},{right_speed}\n"
        uno_serial.write(command.encode('utf-8'))

async def control_with_keyboard():
    global terminal_settings
    print("Use arrow keys to control the robot. Press q or Ctrl-C to quit.\r")
    terminal_settings = _set_terminal_raw_mode()
    key_timestamps: dict[str, float] = {}
    loop = asyncio.get_running_loop()
    
    try:
        while True:
            key = await loop.run_in_executor(None, _read_keypress, 0.1)
            now = time.monotonic()

            if key in {"QUIT", "CTRL_C"}: 
                loop.create_task(shutdown_server()) 
                break
                
            if key:
                if key.startswith("SHIFT_"):
                    key_timestamps["SHIFT"] = now
                    key_timestamps[key[len("SHIFT_"):]] = now
                elif key in {"UP", "DOWN", "LEFT", "RIGHT"}:
                    key_timestamps[key] = now

            key_timestamps = {k: ts for k, ts in key_timestamps.items() if now - ts <= 0.25}
            speeds = _compute_wheel_speeds(set(key_timestamps))
            
            if speeds: 
                send_wheel_speeds_serial(speeds[0], speeds[1])
            else: 
                send_wheel_speeds_serial(0, 0)
    finally:
        if terminal_settings: termios.tcsetattr(sys.stdin.fileno(), termios.TCSADRAIN, terminal_settings)

async def read_from_uno():
    """Background task to print any data the Arduino sends back to the Pi."""
    loop = asyncio.get_running_loop()
    while True:
        if uno_serial and uno_serial.in_waiting > 0:
            # Read non-blocking
            data = await loop.run_in_executor(None, uno_serial.readline)
            if data:
                print(f"UNO says: {data.decode('utf-8').strip()}\r")
        await asyncio.sleep(0.01)

async def start_background_tasks(app):
    background_tasks.append(asyncio.create_task(control_with_keyboard()))
    background_tasks.append(asyncio.create_task(read_from_uno()))

async def cleanup_background_tasks(app):
    if terminal_settings: termios.tcsetattr(sys.stdin.fileno(), termios.TCSADRAIN, terminal_settings)
    for task in background_tasks: task.cancel()
    if uno_serial: uno_serial.close()
    await asyncio.gather(*[pc.close() for pc in pcs])
    pcs.clear()

async def shutdown_server():
    raise KeyboardInterrupt

# ==========================================================
# SERVER START
# ==========================================================
if __name__ == "__main__":
    app = web.Application()
    app.router.add_get("/", index)
    app.router.add_post("/offer", offer)
    
    app.on_startup.append(start_background_tasks)
    app.on_cleanup.append(cleanup_background_tasks)

    print(f"Starting Web Server at http://0.0.0.0:8080... (Serial: {SERIAL_PORT})\r")
    web.run_app(app, host="0.0.0.0", port=8080)
