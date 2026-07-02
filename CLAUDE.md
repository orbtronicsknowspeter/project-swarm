# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Commands

```bash
# Install dependencies (uses uv)
uv sync

# Run a script on the Pi
uv run python src/controller.py
uv run python src/stream.py

# Run weed detection standalone on a webcam (works on any machine, no Pi hardware)
uv run python src/detect_webcam.py

# Format all files
just format          # runs treefmt (ruff-format, prettier, nixfmt, taplo, clang-format)

# Lint all files (check only, no writes)
just lint            # runs treefmt with treefmt.lint.toml

# Render / preview Quarto docs
just quarto-render
just quarto-preview
```

There are no automated tests in this repo.

## Architecture

This project is a **Raspberry Pi rover control stack** with three layers:

### 1. Transport layer — `src/bus.py`

Custom 2-bit parallel GPIO bus (KCBUS) between the Raspberry Pi and a REV Robotics Control Hub. The Control Hub is the clock master. Data moves 2 bits per clock cycle over GPIO pins. The Pi drives motors by writing packed integers (`left_speed` then `128 + right_speed`) over this bus. `bitbang_micropython.py` is the microcontroller-side counterpart — it runs on MicroPython firmware, not CPython, so its imports (`uasyncio`, `machine`) are not in `pyproject.toml`.

### 2. Control + streaming — `src/controller.py`

The primary entry point for the rover. Combines:

- **WebRTC video**: `picamera2` captures frames → `aiortc` sends them to the Meta Quest 3 browser over WebRTC (port 8080)
- **Serial motor control**: keyboard arrow keys → `_compute_wheel_speeds()` → `W:left,right\n` over USB serial to an Arduino Uno, which relays to the Control Hub
- **CV pipeline**: `vision_loop()` background task continuously runs YOLO inference in a thread executor, writes annotated BGR frames to a shared `_frame_lock`-protected buffer; `CameraVideoTrack.recv()` reads from this buffer so inference speed never blocks the 30 fps WebRTC stream
- **Web UI**: retro NASA mission control interface served at `/`; polls `/detections` every 500ms for CV alerts

`src/stream.py` is a stripped-down version of the same WebRTC server without the serial/CV integration — useful for testing camera streaming in isolation.

### 3. CV layer — `src/vision.py`

`WeedDetector` wraps `ultralytics` YOLO with `persist=True` tracking. Input is RGB888 (picamera2 native); it converts to BGR internally before inference and returns an annotated BGR frame. `MODEL_PATH` defaults to `yolov8n.pt` (COCO pretrained placeholder). Swap this to a fine-tuned model path after training on `data/dataset.yaml`.

**Training workflow:**

```bash
yolo train model=yolov8n.pt data=data/dataset.yaml epochs=50 imgsz=640
# then update MODEL_PATH in src/vision.py to runs/detect/train/weights/best.pt
```

`data/dataset.yaml` defines 3 classes: `weed` (0), `crop` (1), `ready-to-harvest` (2).

`src/detect_webcam.py` runs the detector standalone against a local webcam (`cv2.VideoCapture`) — no Pi hardware needed. `picamera2` is gated behind a `platform_machine` marker in `pyproject.toml`, so `uv sync` on a non-Pi dev machine skips it and the CV pipeline can be tested anywhere.

Ultralytics auto-downloads `yolov8n.pt` into the project root on first run; `*.pt` and `runs/` are gitignored, so weights and training outputs never get committed.

### Serial protocol (Pi → Arduino Uno)

| Command             | Meaning                     |
| ------------------- | --------------------------- |
| `W:left,right\n`    | Direct wheel speeds (0–127) |
| `M:feet,throttle\n` | Distance-based forward move |
| `T:value\n`         | Set throttle %              |

### Key async patterns

All I/O (GPIO reads, serial writes, camera captures, YOLO inference) runs via `loop.run_in_executor(None, ...)` to avoid blocking the `aiohttp`/`aiortc` event loop. Background tasks are registered in `start_background_tasks()` and cancelled in `cleanup_background_tasks()`.

## Tooling

- **Package manager**: `uv` with `pyproject.toml`
- **Formatter/linter**: `treefmt` orchestrating `ruff` (Python), `prettier` (JS/YAML/MD), `nixfmt` (Nix), `taplo` (TOML), `clang-format`/`clang-tidy` (C/C++)
- **Dev environment**: Nix flake (`flake.nix`) — run `nix develop` for a reproducible shell. On NixOS, the pip-installed CV wheels (numpy, opencv-python, torch) only import inside this shell: `ld_pkgs` in `flake.nix` supplies their native libs (`zlib`, `libGL`, `glib`, X11/xcb) via `NIX_LD_LIBRARY_PATH`. If a wheel fails with `libfoo.so: cannot open shared object file`, add the missing lib to `ld_pkgs`.
- **Docs**: Quarto (`.qmd` files in `docs/research/`)
- **Task runner**: `just` (`justfile`)
