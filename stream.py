import asyncio
import json
import os
import numpy as np

from aiohttp import web
from aiortc import RTCPeerConnection, RTCSessionDescription, RTCConfiguration, RTCIceServer
from aiortc import VideoStreamTrack

from av import VideoFrame
from picamera2 import Picamera2
from time import sleep


# ==========================================================
# HTML CLIENT (Browser / Quest)
# ==========================================================

INDEX_HTML = """
<!DOCTYPE html>
<html>
<head>
    <title>Pi Camera Stream</title>
</head>
<body>

<h2>Raspberry Pi WebRTC Stream</h2>

<video id="video" autoplay playsinline muted style="width: 100%; max-width: 800px;"></video>

<script>
const pc = new RTCPeerConnection({
    iceServers: [{ urls: "stun:stun.l.google.com:19302" }]
});

// IMPORTANT FIX: declare we want to RECEIVE video
pc.addTransceiver("video", { direction: "recvonly" });

pc.ontrack = (event) => {
    document.getElementById("video").srcObject = event.streams[0];
};

async function start() {

    const offer = await pc.createOffer();
    await pc.setLocalDescription(offer);

    const response = await fetch("/offer", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify({
            sdp: pc.localDescription.sdp,
            type: pc.localDescription.type
        })
    });

    const answer = await response.json();
    await pc.setRemoteDescription(answer);
}

start();
</script>

</body>
</html>
"""


# ==========================================================
# GLOBAL STATE
# ==========================================================

pcs = set()


# ==========================================================
# CAMERA SETUP
# ==========================================================

picam2 = Picamera2()

config = picam2.create_video_configuration(
     main={"size": (1280, 720), "format": "RGB888"}
)

picam2.configure(config)
picam2.start()
sleep(2)  # Let AWB settle
picam2.set_controls({"AwbEnable": False, "ColourGains": (1.1, 1.7)})


# ==========================================================
# VIDEO TRACK
# ==========================================================

class CameraVideoTrack(VideoStreamTrack):

    def __init__(self):
        super().__init__()
        self._debug_saved = False

    async def recv(self):

        # Pace frame delivery to ~30fps
        await asyncio.sleep(1 / 30)

        # Get timestamp BEFORE capture for accurate timing
        pts, time_base = await self.next_timestamp()

        # Capture frame
        frame = picam2.capture_array("main")
        # then feed to PyAV:
        video_frame = VideoFrame.from_ndarray(frame, format="bgr24")
        # print(f"Frame shape: {frame.shape}, dtype: {frame.dtype}")  # DEBUG - remove after fix

        video_frame.pts = pts
        video_frame.time_base = time_base

        return video_frame


# ==========================================================
# WEBRTC OFFER HANDLER
# ==========================================================

async def offer(request):

    params = await request.json()

    offer = RTCSessionDescription(
        sdp=params["sdp"],
        type=params["type"]
    )

    pc = RTCPeerConnection(configuration=RTCConfiguration(
        iceServers=[RTCIceServer(urls=["stun:stun.l.google.com:19302"])]
    ))
    pcs.add(pc)

    print("New WebRTC connection created")

    @pc.on("connectionstatechange")
    async def on_connectionstatechange():
        print("Connection state:", pc.connectionState)

        if pc.connectionState in ("failed", "closed", "disconnected"):
            await pc.close()
            pcs.discard(pc)

    # IMPORTANT: add track BEFORE negotiation
    video_track = CameraVideoTrack()
    pc.addTrack(video_track)

    await pc.setRemoteDescription(offer)

    answer = await pc.createAnswer()
    await pc.setLocalDescription(answer)

    return web.Response(
        content_type="application/json",
        text=json.dumps({
            "sdp": pc.localDescription.sdp,
            "type": pc.localDescription.type
        }),
    )


# ==========================================================
# INDEX ROUTE
# ==========================================================

async def index(request):
    return web.Response(text=INDEX_HTML, content_type="text/html")


# ==========================================================
# CLEANUP
# ==========================================================

async def on_shutdown(app):
    await asyncio.gather(*[pc.close() for pc in pcs])
    pcs.clear()


# ==========================================================
# SERVER START
# ==========================================================

app = web.Application()
app.on_shutdown.append(on_shutdown)

app.router.add_get("/", index)
app.router.add_post("/offer", offer)

if __name__ == "__main__":
    web.run_app(app, host="0.0.0.0", port=8080)
