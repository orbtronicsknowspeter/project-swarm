# Virtual Control of Swarm Vehicles

## Overview

This project demonstrates a proof-of-concept swarm autonomous vehicle system using a Meta Quest 3 headset as the control interface. For the demo, we are creating duplicate Mars rover platforms that can be controlled from the Quest, with each rover providing live video and command telemetry back to the operator.

The goal is to merge immersive VR/AR control with Raspberry Pi-based rover hardware, enabling a human operator to guide multiple rovers in a coordinated swarm mission.

## Demo Concept

- Duplicate Mars rover vehicles are built as the demo platforms.
- A Meta Quest 3 headset is used as the pilot interface for one or more rovers.
- Each rover streams live camera video to the headset via WebRTC.
- Control commands are sent from the Quest through the rover's control stack to a REV Robotics Control Hub.

This setup is intended to showcase how mixed reality control can scale to multiple autonomous vehicles in a swarm, with each rover acting as a duplicate unit in the mission.

## Project Components

- `stream.py`
  - Implements a Raspberry Pi WebRTC server using `aiohttp`, `aiortc`, and `picamera2`.
  - Serves an HTML client that can be opened on the Meta Quest 3 browser.
  - Captures live camera frames and sends them to the Quest as a video stream.

- `bus.py`
  - Implements a custom 2-bit parallel communication bus between a Raspberry Pi and a REV Robotics Control Hub.
  - Provides asynchronous read/write support for rover telemetry and command transfer.
  - Designed for use in the rover control path where low-latency signaling is required.

## How It Works

1. The Quest browser connects to the Raspberry Pi's `stream.py` WebRTC service.
2. `stream.py` captures video from the Pi camera and sends it to the Quest headset.
3. Control input from the Quest is translated into commands on the rover side.
4. `bus.py` communicates those commands to the REV Control Hub, which drives the rover actuators.
5. The same architecture can be duplicated across multiple rover units to form a swarm.

## Requirements

- Raspberry Pi with camera support
- Meta Quest 3 headset with browser access
- Python dependencies: `aiohttp`, `aiortc`, `av`, `picamera2`, `gpiozero`, `numpy`
- REV Robotics Control Hub and compatible rover hardware

## Running the Demo

1. Install the required Python packages on the Raspberry Pi.
2. Start `stream.py` on the Pi:

```bash
python3 stream.py
```

3. Open the Meta Quest 3 browser and navigate to the Pi's IP address.
4. Allow the browser to connect and view the live rover camera stream.
5. Use the demo control interface to send navigation or swarm commands.

## Future Work

- Add explicit Quest controller input mapping.
- Support multiple rover instances from a single Quest session.
- Add autonomous swarm behaviours and mission coordination.
- Implement better status and feedback telemetry for each rover.

## Notes

This repository is focused on the core communication and streaming foundation for an immersive swarm rover demo rather than a finished consumer product. The duplicate Mars rover concept is the central narrative for the demo: multiple identical vehicles controlled through a shared Meta Quest 3 experience.
