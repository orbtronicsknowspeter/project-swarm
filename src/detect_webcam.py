"""
Standalone weed-detection demo: YOLO tracking on a webcam feed.

Runs on any machine with a webcam — no Pi hardware, serial, or WebRTC
stack required. Useful for testing the CV pipeline in isolation.

Usage:
    uv run python src/detect_webcam.py
    uv run python src/detect_webcam.py --camera 1
    uv run python src/detect_webcam.py --model runs/detect/train/weights/best.pt

Press "q" in the video window to quit.
"""

from __future__ import annotations

import argparse
import time

import cv2

from vision import MODEL_PATH, WeedDetector

WINDOW_NAME = "swarm agri-vision"


def main() -> None:
    parser = argparse.ArgumentParser(description="Webcam weed-detection demo")
    parser.add_argument(
        "--camera", type=int, default=0, help="webcam device index (default: 0)"
    )
    parser.add_argument(
        "--model", default=MODEL_PATH, help=f"YOLO weights path (default: {MODEL_PATH})"
    )
    args = parser.parse_args()

    cap = cv2.VideoCapture(args.camera)
    if not cap.isOpened():
        raise SystemExit(f"error: could not open camera {args.camera}")

    detector = WeedDetector(args.model)
    prev = time.monotonic()

    try:
        while True:
            ok, bgr = cap.read()
            if not ok:
                print("error: camera returned no frame, stopping")
                break

            # WeedDetector expects RGB input (picamera2 convention)
            rgb = cv2.cvtColor(bgr, cv2.COLOR_BGR2RGB)
            annotated, detections = detector.run(rgb)

            now = time.monotonic()
            fps = 1.0 / (now - prev) if now > prev else 0.0
            prev = now
            cv2.putText(
                annotated,
                f"{fps:.1f} fps | {len(detections)} detection(s)",
                (10, 24),
                cv2.FONT_HERSHEY_SIMPLEX,
                0.6,
                (255, 255, 255),
                2,
            )

            cv2.imshow(WINDOW_NAME, annotated)
            if cv2.waitKey(1) & 0xFF == ord("q"):
                break
    finally:
        cap.release()
        cv2.destroyAllWindows()


if __name__ == "__main__":
    main()
