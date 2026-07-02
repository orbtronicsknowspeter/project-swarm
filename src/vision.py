"""
Computer vision module: weed and crop detection via YOLOv8 tracking.

Swap MODEL_PATH to your fine-tuned model after training:
    MODEL_PATH = "runs/detect/train/weights/best.pt"

Training command (from project root):
    yolo train model=yolov8n.pt data=data/dataset.yaml epochs=50 imgsz=640
"""

from __future__ import annotations

from dataclasses import dataclass

import cv2
import numpy as np
from ultralytics import YOLO

# Placeholder — replace with fine-tuned weights after training your dataset
MODEL_PATH = "yolov8n.pt"

# BGR colors per class label (OpenCV convention)
_COLORS: dict[str, tuple[int, int, int]] = {
    "weed": (0, 0, 255),  # red
    "crop": (0, 255, 0),  # green
    "ready-to-harvest": (255, 128, 0),  # amber
}
_DEFAULT_COLOR = (255, 128, 0)


@dataclass
class Detection:
    label: str
    confidence: float
    bbox: tuple[int, int, int, int]  # x1, y1, x2, y2
    track_id: int | None = None


class WeedDetector:
    """
    Wraps a YOLO model for persistent per-frame object tracking.

    Input:  RGB888 numpy array (as provided by picamera2)
    Output: BGR annotated frame (ready for PyAV VideoFrame bgr24) + detections
    """

    def __init__(self, model_path: str = MODEL_PATH) -> None:
        self.model = YOLO(model_path)

    def run(self, frame: np.ndarray) -> tuple[np.ndarray, list[Detection]]:
        """Run tracking on a single RGB frame. Returns (annotated_bgr, detections)."""
        bgr = cv2.cvtColor(frame, cv2.COLOR_RGB2BGR)
        results = self.model.track(bgr, persist=True, verbose=False)
        detections: list[Detection] = []

        if results[0].boxes is not None:
            boxes = results[0].boxes
            for box in boxes:
                x1, y1, x2, y2 = map(int, box.xyxy[0])
                cls_idx = int(box.cls[0])
                label = results[0].names[cls_idx]
                conf = float(box.conf[0])
                track_id = int(box.id[0]) if box.id is not None else None

                color = _COLORS.get(label, _DEFAULT_COLOR)
                cv2.rectangle(bgr, (x1, y1), (x2, y2), color, 2)

                id_str = f" #{track_id}" if track_id is not None else ""
                cv2.putText(
                    bgr,
                    f"{label}{id_str} {conf:.2f}",
                    (x1, y1 - 8),
                    cv2.FONT_HERSHEY_SIMPLEX,
                    0.5,
                    color,
                    2,
                )

                detections.append(
                    Detection(
                        label=label,
                        confidence=conf,
                        bbox=(x1, y1, x2, y2),
                        track_id=track_id,
                    )
                )

        return bgr, detections
