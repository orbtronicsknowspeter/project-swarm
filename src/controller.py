"""
Raspberry Pi WebRTC Streamer + Arduino Uno Commander
"""

import asyncio
import select
import sys
import termios
import threading
import time
import tty
import json
import serial

import numpy as np

from vision import WeedDetector

from aiohttp import web
from aiortc import (
    RTCPeerConnection,
    RTCSessionDescription,
    RTCConfiguration,
    RTCIceServer,
    VideoStreamTrack,
)
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
except serial.SerialException:
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
    if not first:
        return None
    if first != "\x1b":
        if first == "\x03":
            return "CTRL_C"
        if first.lower() == "q":
            return "QUIT"
        return first.upper()
    escape_map = {"A": "UP", "B": "DOWN", "C": "RIGHT", "D": "LEFT"}
    if _read_char(0.05) != "[":
        return None
    third = _read_char(0.05)
    if third in escape_map:
        return escape_map[third]
    if third != "1" or _read_char(0.05) != ";":
        return None
    modifier, arrow = _read_char(0.05), _read_char(0.05)
    return (
        f"SHIFT_{escape_map[arrow]}"
        if modifier == "2" and arrow in escape_map
        else None
    )


def _compute_wheel_speeds(active_keys: set[str]) -> tuple[int, int] | None:
    boost = "SHIFT" in active_keys
    base, turn = (90, 35) if boost else (50, 25)
    fwd, left, right, stop = (
        "UP" in active_keys,
        "LEFT" in active_keys,
        "RIGHT" in active_keys,
        "DOWN" in active_keys,
    )
    if fwd:
        return (
            (max(0, base - turn), min(127, base + turn))
            if left
            else (min(127, base + turn), max(0, base - turn))
            if right
            else (base, base)
        )
    if left:
        return (0, base)
    if right:
        return (base, 0)
    if stop:
        return (0, 0)
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
<html>
<head>
  <title>ROVER-1 Mission Control</title>
  <meta charset="UTF-8">
  <style>
    * { margin: 0; padding: 0; box-sizing: border-box; }
    body {
      background: #07070f;
      color: #e0a030;
      font-family: 'Courier New', monospace;
      height: 100vh;
      display: flex;
      flex-direction: column;
      overflow: hidden;
    }

    /* ── Header ── */
    .header {
      background: #0b0b1a;
      border-bottom: 1px solid #2a2040;
      padding: 7px 18px;
      display: flex;
      justify-content: space-between;
      align-items: center;
      flex-shrink: 0;
    }
    .header h1 { font-size: 1rem; letter-spacing: 5px; text-transform: uppercase; }
    .header-left { display: flex; align-items: center; gap: 18px; }
    .header-left .agency { font-size: 0.58rem; letter-spacing: 3px; color: #556688; }
    .status-bar { display: flex; gap: 22px; font-size: 0.68rem; align-items: center; }
    .indicator { display: flex; align-items: center; gap: 6px; letter-spacing: 1px; }
    .dot { width: 7px; height: 7px; border-radius: 50%; background: #442200; }
    .dot.live { background: #33ff88; box-shadow: 0 0 6px #33ff88; animation: blink 2s infinite; }
    .dot.warn { background: #ff8833; box-shadow: 0 0 6px #ff8833; }
    @keyframes blink { 0%,100%{opacity:1} 50%{opacity:.35} }
    #utc-clock { color: #556688; letter-spacing: 2px; }

    /* ── Main layout ── */
    .main {
      flex: 1;
      display: flex;
      gap: 10px;
      padding: 10px;
      overflow: hidden;
      min-height: 0;
    }

    /* ── Panels ── */
    .side-panel { width: 185px; display: flex; flex-direction: column; gap: 8px; flex-shrink: 0; }
    .box {
      background: #0b0b1a;
      border: 1px solid #1e1e38;
      padding: 10px 12px;
    }
    .box h3 {
      font-size: 0.58rem;
      letter-spacing: 3px;
      color: #e0a030;
      border-bottom: 1px solid #1e1e38;
      padding-bottom: 7px;
      margin-bottom: 9px;
      text-transform: uppercase;
    }
    .trow {
      display: flex;
      justify-content: space-between;
      font-size: 0.68rem;
      padding: 3px 0;
      border-bottom: 1px solid #111126;
    }
    .trow:last-child { border-bottom: none; }
    .tlabel { color: #445566; text-transform: uppercase; letter-spacing: 1px; }
    .tval { color: #d0d0e0; }
    .tval.good { color: #33ff88; }
    .tval.warn { color: #ff8833; }
    .tval.active { color: #44aaff; }

    /* ── Command log ── */
    .cmd-log {
      font-size: 0.6rem;
      line-height: 1.75;
      color: #445566;
      max-height: 90px;
      overflow-y: auto;
      scrollbar-width: thin;
      scrollbar-color: #2a2040 transparent;
    }
    .cmd-log .entry { color: #33ff88; }
    .cmd-log .entry::before { content: '› '; color: #e0a030; }
    .cmd-log .err { color: #ff4444; }

    /* ── Center video ── */
    .video-col {
      flex: 1;
      display: flex;
      align-items: center;
      justify-content: center;
      min-width: 0;
    }
    .video-wrap {
      position: relative;
      width: 100%;
      max-width: 860px;
      border: 1px solid #e0a030;
      box-shadow: 0 0 40px rgba(224,160,48,.15), 0 0 2px rgba(224,160,48,.4);
    }
    /* corner brackets */
    .corner { position: absolute; width: 18px; height: 18px; border-color: #e0a030; border-style: solid; z-index: 5; }
    .corner.tl { top:-1px; left:-1px; border-width: 2px 0 0 2px; }
    .corner.tr { top:-1px; right:-1px; border-width: 2px 2px 0 0; }
    .corner.bl { bottom:-1px; left:-1px; border-width: 0 0 2px 2px; }
    .corner.br { bottom:-1px; right:-1px; border-width: 0 2px 2px 0; }

    video { width: 100%; display: block; background: #000; }

    /* ── HUD overlays ── */
    .hud {
      position: absolute; top:0; left:0; right:0; bottom:0;
      pointer-events: none;
    }
    .hud-tl { position:absolute; top:10px; left:12px; font-size:.6rem; color:#e0a03066; line-height:1.7; }
    .hud-tr { position:absolute; top:10px; right:12px; font-size:.6rem; color:#e0a03066; text-align:right; line-height:1.7; }
    .hud-bot { position:absolute; bottom:9px; left:50%; transform:translateX(-50%); font-size:.58rem; color:#e0a03044; letter-spacing:4px; white-space:nowrap; }
    .crosshair {
      position:absolute; top:50%; left:50%;
      transform:translate(-50%,-50%);
      width:36px; height:36px;
      border:1px solid #e0a03033;
      border-radius:50%;
    }
    .crosshair::before, .crosshair::after { content:''; position:absolute; background:#e0a03033; }
    .crosshair::before { width:1px; height:55px; top:-9px; left:50%; }
    .crosshair::after  { width:55px; height:1px; left:-9px; top:50%; }
    @keyframes scan { 0%{top:-5%} 100%{top:105%} }
    .scanline {
      position:absolute; left:0; right:0; height:3px;
      background: linear-gradient(transparent, rgba(224,160,48,.04), transparent);
      animation: scan 5s linear infinite;
      pointer-events:none;
    }

    /* ── Bottom bar ── */
    .bottom-bar {
      background: #0b0b1a;
      border-top: 1px solid #1e1e38;
      padding: 10px 18px;
      display: flex;
      align-items: center;
      gap: 24px;
      flex-shrink: 0;
    }
    .section-tag { font-size:.6rem; letter-spacing:3px; color:#e0a030; text-transform:uppercase; white-space:nowrap; }
    .divider { width:1px; height:28px; background:#1e1e38; flex-shrink:0; }

    /* move buttons */
    .move-btns { display:flex; gap:8px; }
    .mbtn {
      background: #0a1008;
      border: 1px solid #e0a030;
      color: #e0a030;
      padding: 7px 15px;
      font-family: 'Courier New', monospace;
      font-size: .72rem;
      letter-spacing: 2px;
      cursor: pointer;
      text-transform: uppercase;
      transition: background .12s, color .12s, box-shadow .12s;
    }
    .mbtn:hover { background:#e0a030; color:#07070f; box-shadow:0 0 12px rgba(224,160,48,.5); }
    .mbtn:active { transform:scale(.95); }

    /* throttle slider */
    .slider-wrap { flex:1; display:flex; flex-direction:column; gap:5px; }
    .slider-head { display:flex; justify-content:space-between; font-size:.65rem; letter-spacing:2px; }
    .slider-val { color:#44aaff; font-weight:bold; }
    input[type=range] {
      -webkit-appearance:none; width:100%; height:3px;
      background:#1a1a2e; border:1px solid #2a2040; outline:none; cursor:pointer;
    }
    input[type=range]::-webkit-slider-thumb {
      -webkit-appearance:none; width:14px; height:14px;
      background:#e0a030; border:2px solid #07070f;
      box-shadow:0 0 8px rgba(224,160,48,.6); cursor:pointer;
    }

    /* ── CV Detections ── */
    .tval.cv-clear { color: #33ff88; }
    .tval.cv-alert { color: #ff4444; animation: blink 0.5s infinite; }
    .video-wrap.weed-alert {
      border-color: #ff4444;
      box-shadow: 0 0 40px rgba(255,68,68,.25), 0 0 2px rgba(255,68,68,.6);
    }
  </style>
</head>
<body>

<!-- HEADER -->
<div class="header">
  <div class="header-left">
    <span class="agency">NASA / JPL-CALTECH</span>
    <h1>ROVER&#x2011;1 &nbsp;&#x2f;&#x2f;&nbsp; MISSION CONTROL</h1>
  </div>
  <div class="status-bar">
    <div class="indicator"><div class="dot live" id="dot-video"></div><span>VIDEO LINK</span></div>
    <div class="indicator"><div class="dot warn" id="dot-serial"></div><span>SERIAL</span></div>
    <div class="indicator"><span id="utc-clock">--:--:-- UTC</span></div>
  </div>
</div>

<!-- MAIN -->
<div class="main">

  <!-- LEFT PANEL -->
  <div class="side-panel">
    <div class="box">
      <h3>Telemetry</h3>
      <div class="trow"><span class="tlabel">Throttle</span><span class="tval active" id="t-throttle">50%</span></div>
      <div class="trow"><span class="tlabel">L Motor</span><span class="tval" id="t-left">0</span></div>
      <div class="trow"><span class="tlabel">R Motor</span><span class="tval" id="t-right">0</span></div>
      <div class="trow"><span class="tlabel">Signal</span><span class="tval good">NOMINAL</span></div>
      <div class="trow"><span class="tlabel">Uptime</span><span class="tval" id="t-uptime">00:00</span></div>
    </div>
    <div class="box">
      <h3>Drive Mode</h3>
      <div class="trow"><span class="tlabel">Mode</span><span class="tval good">MANUAL</span></div>
      <div class="trow"><span class="tlabel">Input</span><span class="tval good">KEYBOARD</span></div>
      <div class="trow"><span class="tlabel">Boost</span><span class="tval">SHIFT+KEY</span></div>
    </div>
  </div>

  <!-- CENTER VIDEO -->
  <div class="video-col">
    <div class="video-wrap">
      <div class="corner tl"></div>
      <div class="corner tr"></div>
      <div class="corner bl"></div>
      <div class="corner br"></div>
      <video id="video" autoplay playsinline muted></video>
      <div class="hud">
        <div class="scanline"></div>
        <div class="hud-tl">
          CAM: WIDE&#x2011;ANGLE MONO<br>
          RES: 1280&times;720 @ 30fps<br>
          CODEC: H.264 / RTP
        </div>
        <div class="hud-tr">
          FRAME: <span id="hud-frame">000000</span><br>
          LATENCY: ~20ms<br>
          GAIN: AUTO
        </div>
        <div class="crosshair"></div>
        <div class="hud-bot">// LIVE TERRAIN FEED //</div>
      </div>
    </div>
  </div>

  <!-- RIGHT PANEL -->
  <div class="side-panel">
    <div class="box">
      <h3>Navigation</h3>
      <div class="trow"><span class="tlabel">Dist</span><span class="tval" id="nav-dist">0.00 ft</span></div>
      <div class="trow"><span class="tlabel">Target</span><span class="tval" id="nav-target">&#x2014;&#x2014;</span></div>
      <div class="trow"><span class="tlabel">Status</span><span class="tval good" id="nav-status">IDLE</span></div>
    </div>
    <div class="box">
      <h3>CV Detections</h3>
      <div class="trow"><span class="tlabel">Weeds</span><span class="tval" id="cv-weeds">—</span></div>
      <div class="trow"><span class="tlabel">Crops</span><span class="tval" id="cv-crops">—</span></div>
      <div class="trow"><span class="tlabel">Alert</span><span class="tval cv-clear" id="cv-alert">CLEAR</span></div>
    </div>
    <div class="box" style="flex:1; display:flex; flex-direction:column;">
      <h3>Command Log</h3>
      <div class="cmd-log" id="cmd-log">
        <div style="color:#445566;">Awaiting commands&hellip;</div>
      </div>
    </div>
  </div>

</div>

<!-- BOTTOM BAR -->
<div class="bottom-bar">
  <span class="section-tag">FWD MOVE</span>
  <div class="move-btns">
    <button class="mbtn" onclick="moveForward(3)">3 FT</button>
    <button class="mbtn" onclick="moveForward(10)">10 FT</button>
    <button class="mbtn" onclick="moveForward(30)">30 FT</button>
  </div>
  <div class="divider"></div>
  <div class="slider-wrap">
    <div class="slider-head">
      <span>SPEED THROTTLE</span>
      <span class="slider-val" id="slider-label">50%</span>
    </div>
    <input type="range" id="throttle" min="0" max="100" value="50"
           oninput="onThrottle(this.value)">
  </div>
</div>

<script>
// ── WebRTC ──────────────────────────────────────────────────
const pc = new RTCPeerConnection({ iceServers: [{ urls: "stun:stun.l.google.com:19302" }] });
pc.addTransceiver("video", { direction: "recvonly" });
pc.ontrack = e => { document.getElementById("video").srcObject = e.streams[0]; };
pc.onconnectionstatechange = () => {
  document.getElementById("dot-video")
    .classList.toggle("live", pc.connectionState === "connected");
};
(async () => {
  const offer = await pc.createOffer();
  await pc.setLocalDescription(offer);
  const res = await fetch("/offer", {
    method: "POST", headers: {"Content-Type": "application/json"},
    body: JSON.stringify({ sdp: pc.localDescription.sdp, type: pc.localDescription.type })
  });
  await pc.setRemoteDescription(await res.json());
})();

// ── Throttle slider ─────────────────────────────────────────
let throttleValue = 50;

function onThrottle(val) {
  throttleValue = parseInt(val);
  document.getElementById("slider-label").textContent = throttleValue + "%";
  document.getElementById("t-throttle").textContent  = throttleValue + "%";
  fetch("/command", {
    method: "POST", headers: {"Content-Type": "application/json"},
    body: JSON.stringify({ type: "throttle", value: throttleValue })
  });
}

/** Call this from the console to read the current throttle position */
function getThrottle() { return throttleValue; }

// ── Move forward buttons ─────────────────────────────────────
let totalDist = 0;

function moveForward(feet) {
  totalDist += feet;
  document.getElementById("nav-dist").textContent   = totalDist.toFixed(2) + " ft";
  document.getElementById("nav-target").textContent = feet + " ft";
  const statusEl = document.getElementById("nav-status");
  statusEl.textContent = "MOVING";
  statusEl.style.color = "#e0a030";
  addLog("MOVE FWD " + feet + "ft @ " + throttleValue + "%");
  fetch("/command", {
    method: "POST", headers: {"Content-Type": "application/json"},
    body: JSON.stringify({ type: "move_forward", feet: feet, throttle: throttleValue })
  }).then(r => r.json()).then(() => {
    statusEl.textContent = "IDLE";
    statusEl.style.color = "#33ff88";
    addLog("ACK: cmd dispatched");
  }).catch(() => {
    statusEl.textContent = "ERR";
    statusEl.style.color = "#ff4444";
    addLog("ERR: no response");
  });
}

// ── Command log ──────────────────────────────────────────────
function addLog(msg) {
  const log = document.getElementById("cmd-log");
  const d = document.createElement("div");
  d.className = "entry";
  const t = new Date().toTimeString().slice(0,8);
  d.textContent = "[" + t + "] " + msg;
  log.appendChild(d);
  log.scrollTop = log.scrollHeight;
}

// ── HUD frame counter ────────────────────────────────────────
let fc = 0;
setInterval(() => {
  document.getElementById("hud-frame").textContent = String(fc++).padStart(6,"0");
}, 33);

// ── UTC clock ────────────────────────────────────────────────
function tickClock() {
  const n = new Date();
  document.getElementById("utc-clock").textContent =
    [n.getUTCHours(), n.getUTCMinutes(), n.getUTCSeconds()]
      .map(x => String(x).padStart(2,"0")).join(":") + " UTC";
}
setInterval(tickClock, 1000); tickClock();

// ── Uptime ───────────────────────────────────────────────────
const t0 = Date.now();
setInterval(() => {
  const s = Math.floor((Date.now() - t0) / 1000);
  document.getElementById("t-uptime").textContent =
    String(Math.floor(s/60)).padStart(2,"0") + ":" + String(s%60).padStart(2,"0");
}, 1000);

// ── CV detections polling ─────────────────────────────────────
let _lastAlert = false;
async function pollDetections() {
  try {
    const data = await fetch("/detections").then(r => r.json());
    document.getElementById("cv-weeds").textContent = data.weeds;
    document.getElementById("cv-crops").textContent = data.crops;
    const alertEl = document.getElementById("cv-alert");
    const vw = document.querySelector(".video-wrap");
    if (data.alert) {
      alertEl.textContent = "WEED DETECTED";
      alertEl.className = "tval cv-alert";
      vw.classList.add("weed-alert");
      if (!_lastAlert) addLog("ALERT: " + data.weeds + " weed(s) in frame");
    } else {
      alertEl.textContent = "CLEAR";
      alertEl.className = "tval cv-clear";
      vw.classList.remove("weed-alert");
      if (_lastAlert) addLog("CV: field clear");
    }
    _lastAlert = data.alert;
  } catch(e) {}
}
setInterval(pollDetections, 500);
</script>
</body>
</html>
"""

# ==========================================================
# CV PIPELINE STATE
# ==========================================================

detector = WeedDetector()
_latest_annotated_frame: np.ndarray | None = None
_frame_lock = threading.Lock()
detection_state: dict = {"weeds": 0, "crops": 0, "alert": False, "detections": []}

pcs = set()
picam2 = Picamera2()
config = picam2.create_video_configuration(
    main={"size": (1280, 720), "format": "RGB888"}
)
picam2.configure(config)
picam2.start()


class CameraVideoTrack(VideoStreamTrack):
    async def recv(self):
        await asyncio.sleep(1 / 30)
        pts, time_base = await self.next_timestamp()

        with _frame_lock:
            frame = _latest_annotated_frame

        if frame is None:
            # Vision loop hasn't produced a frame yet — fall back to raw capture
            loop = asyncio.get_running_loop()
            frame = await loop.run_in_executor(None, picam2.capture_array, "main")
            video_frame = VideoFrame.from_ndarray(frame, format="bgr24")
        else:
            # Annotated BGR frame from vision pipeline
            video_frame = VideoFrame.from_ndarray(frame, format="bgr24")

        video_frame.pts, video_frame.time_base = pts, time_base
        return video_frame


async def offer(request):
    params = await request.json()
    offer = RTCSessionDescription(sdp=params["sdp"], type=params["type"])
    pc = RTCPeerConnection(
        configuration=RTCConfiguration(
            iceServers=[RTCIceServer(urls=["stun:stun.l.google.com:19302"])]
        )
    )
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
    return web.Response(
        content_type="application/json",
        text=json.dumps(
            {"sdp": pc.localDescription.sdp, "type": pc.localDescription.type}
        ),
    )


async def index(request):
    return web.Response(text=INDEX_HTML, content_type="text/html")


async def command(request):
    data = await request.json()
    cmd_type = data.get("type")
    if cmd_type == "move_forward" and uno_serial:
        feet = data.get("feet", 0)
        throttle = data.get("throttle", 50)
        msg = f"M:{feet},{throttle}\n"
        uno_serial.write(msg.encode("utf-8"))
        uno_serial.flush()
    elif cmd_type == "throttle" and uno_serial:
        value = data.get("value", 50)
        msg = f"T:{value}\n"
        uno_serial.write(msg.encode("utf-8"))
        uno_serial.flush()
    return web.Response(
        content_type="application/json", text=json.dumps({"status": "ok"})
    )


# ==========================================================
# DETECTIONS ENDPOINT
# ==========================================================


async def detections(request):
    return web.Response(
        content_type="application/json",
        text=json.dumps(detection_state),
    )


# ==========================================================
# BACKGROUND TASKS
# ==========================================================
terminal_settings = None
background_tasks = []


async def vision_loop():
    """
    Continuously captures frames, runs YOLO tracking, and writes the
    annotated BGR frame to the shared buffer for WebRTC to pick up.
    Decoupled from recv() so inference speed doesn't block the video stream.
    """
    global _latest_annotated_frame, detection_state
    loop = asyncio.get_running_loop()
    while True:
        raw = await loop.run_in_executor(None, picam2.capture_array, "main")
        annotated, dets = await loop.run_in_executor(None, detector.run, raw)

        with _frame_lock:
            _latest_annotated_frame = annotated

        weeds = sum(1 for d in dets if d.label == "weed")
        crops = sum(1 for d in dets if d.label == "crop")
        detection_state = {
            "weeds": weeds,
            "crops": crops,
            "alert": weeds > 0,
            "detections": [
                {"label": d.label, "conf": round(d.confidence, 2), "id": d.track_id}
                for d in dets
            ],
        }
        # yield to event loop between inference runs
        await asyncio.sleep(0)


def send_wheel_speeds_serial(left_speed: int, right_speed: int):
    """Sends target speeds to the Arduino Uno over USB."""
    if uno_serial:
        command = f"W:{left_speed},{right_speed}\n"
        uno_serial.write(command.encode("utf-8"))
        # Ensure it flushes to the OS immediately
        uno_serial.flush()


async def control_with_keyboard():
    global terminal_settings
    print("Use arrow keys to control the robot. Press q or Ctrl-C to quit.\r")
    terminal_settings = _set_terminal_raw_mode()
    key_timestamps: dict[str, float] = {}
    loop = asyncio.get_running_loop()

    # --- FIX 1: Track the last sent speeds ---
    last_left = -1
    last_right = -1

    try:
        while True:
            # Drop the timeout to 0.05 for tighter responsiveness
            key = await loop.run_in_executor(None, _read_keypress, 0.05)
            now = time.monotonic()

            if key in {"QUIT", "CTRL_C"}:
                loop.create_task(shutdown_server())
                break

            if key:
                if key.startswith("SHIFT_"):
                    key_timestamps["SHIFT"] = now
                    key_timestamps[key[len("SHIFT_") :]] = now
                elif key in {"UP", "DOWN", "LEFT", "RIGHT"}:
                    key_timestamps[key] = now

            # Remove released keys
            key_timestamps = {
                k: ts for k, ts in key_timestamps.items() if now - ts <= 0.25
            }
            speeds = _compute_wheel_speeds(set(key_timestamps))

            # Determine current target speeds
            current_left, current_right = speeds if speeds else (0, 0)

            # --- FIX 2: Only send data if the speeds actually changed! ---
            if current_left != last_left or current_right != last_right:
                # --- FIX 3: Run the write in an executor so it never blocks WebRTC ---
                await loop.run_in_executor(
                    None, send_wheel_speeds_serial, current_left, current_right
                )
                last_left = current_left
                last_right = current_right

            # --- FIX 4: Small sleep prevents CPU spiking ---
            await asyncio.sleep(0.01)

    finally:
        if terminal_settings:
            termios.tcsetattr(sys.stdin.fileno(), termios.TCSADRAIN, terminal_settings)


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
    background_tasks.append(asyncio.create_task(vision_loop()))


async def cleanup_background_tasks(app):
    if terminal_settings:
        termios.tcsetattr(sys.stdin.fileno(), termios.TCSADRAIN, terminal_settings)
    for task in background_tasks:
        task.cancel()
    if uno_serial:
        uno_serial.close()
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
    app.router.add_post("/command", command)
    app.router.add_get("/detections", detections)

    app.on_startup.append(start_background_tasks)
    app.on_cleanup.append(cleanup_background_tasks)

    print(f"Starting Web Server at http://0.0.0.0:8080... (Serial: {SERIAL_PORT})\r")
    web.run_app(app, host="0.0.0.0", port=8080)
