"""
KCBUS — Kevon Clarke BUS
Custom 2-bit parallel bus for communication between a Raspberry Pi and a
REV Robotics Control Hub.

Dependencies: gpiozero (pre-installed on Raspberry Pi OS)
"""

import asyncio
import select
import sys
import termios
import time
import tty
from collections import deque
from gpiozero import DigitalInputDevice, OutputDevice


class KCBUS:
    """
    Custom 2-bit parallel bus between a Raspberry Pi and a REV Control Hub.

    The Control Hub is the clock master. Data moves 2 bits per clock cycle:
      • read_pins  (2 inputs)  — data arriving from the Control Hub.
      • write_pins (2 outputs) — data leaving to the Control Hub.

    Pin roles
    ---------
    read_pins        : GPIO inputs  — data arriving from the Control Hub.
    write_pins       : GPIO outputs — data leaving to the Control Hub.
    input_clk        : GPIO input   — clock driven by the Control Hub.
    input_state_pin  : GPIO input   — Control Hub asserts HIGH when it wants
                       to send data to the Pi.
    output_state_pin : GPIO output  — Pi asserts HIGH when it wants to send
                       data to the Control Hub.
    """

    BUFFER_MAX = 5
    POLL_YIELD = 0  # seconds; 0 = yield without sleeping
    READ_TIMEOUT_YIELDS = 100_000  # abort read after this many poll iterations

    def __init__(
        self,
        read_pins: list[int],
        write_pins: list[int],
        input_clk: int,
        output_clk: int,
        output_clk_freq: float,
        input_state_pin: int,
        output_state_pin: int,
    ):
        if len(read_pins) != 2 or len(write_pins) != 2:
            raise ValueError(
                "read_pins and write_pins must each have exactly 2 entries."
            )

        self.buffer: deque[int] = deque(maxlen=self.BUFFER_MAX)

        # Inputs (inverted because the Control Hub uses active-low signalling)
        self.read_pins = [DigitalInputDevice(pin) for pin in read_pins]
        self.input_clk = DigitalInputDevice(input_clk)
        self.input_state_pin = DigitalInputDevice(input_state_pin)

        # Outputs — start LOW in logical terms, but use inverted GPIO polarity
        self.write_pins = [
            OutputDevice(pin, initial_value=False, active_high=True)
            for pin in write_pins
        ]
        self.output_state_pin = OutputDevice(
            output_state_pin, initial_value=False, active_high=True
        )
        self.output_clk = OutputDevice(
            output_clk, initial_value=False, active_high=True
        )
        self.output_clk_freq = output_clk_freq

    # ------------------------------------------------------------------
    # Read
    # ------------------------------------------------------------------

    async def read(self) -> int:
        """
        Receive one multi-bit word from the Control Hub.

        Call only after confirming input_state_pin is HIGH. Bits are
        sampled on every rising clock edge, 2 bits per edge (one per
        read pin), LSB-first.

        Returns the assembled integer, or the partial value on timeout.
        """
        data = 0
        bit_position = 0
        prev_clock = self.input_clk.value
        yields = 0

        while self.input_state_pin.value:
            curr_clock = self.input_clk.value

            if curr_clock and not prev_clock:  # Rising edge in logical terms
                for pin in reversed(self.read_pins):
                    # The MSB of the data comes in first, so fix the code below to shift the bits into the correct position.
                    data = (data << 1) | pin.value
                    # print(f"Data: {data:#010b}, bit_position: {bit_position}, pin.value: {pin.value}")
                bit_position += len(self.read_pins)

            prev_clock = curr_clock

            await asyncio.sleep(self.POLL_YIELD)
            yields += 1
            if yields >= self.READ_TIMEOUT_YIELDS:
                break  # Hub left input_state_pin stuck HIGH — bail out.

        return data

    # ------------------------------------------------------------------
    # Write
    # ------------------------------------------------------------------

    async def write(self, data: int, bit_length: int) -> None:
        """
        Transmit *bit_length* bits to the Control Hub.

        Data is placed on the bus on falling clock edges so the Hub can
        sample on the subsequent rising edge. 2 bits per clock cycle
        (one per write pin), MSB-first within each pair.

        output_state_pin is held HIGH for the entire transfer and is
        lowered (along with the data pins) in a finally block.
        """
        if bit_length % len(self.write_pins) != 0:
            raise ValueError(
                f"bit_length ({bit_length}) must be a multiple of "
                f"the number of write pins ({len(self.write_pins)})."
            )
        remaining = bit_length

        try:
            clock_state = self.input_clk.value  # Start in sync with the Hub's clock
            prev_clock = clock_state
            while remaining > 0:
                self.output_state_pin.on()  # Signal to the Hub that we're writing data.
                clock_state = self.input_clk.value
                if not clock_state and prev_clock:
                    # Preset the data pins for the next rising edge. The MSB of the data goes on the first pin, so shift the bits accordingly.
                    for i, pin in enumerate(reversed(self.write_pins)):
                        bit_index = remaining - 1 - i
                        bit = (data >> bit_index) & 0x01 if bit_index >= 0 else 0
                        pin.value = bit
                    remaining -= len(self.write_pins)
                prev_clock = clock_state
            while not self.input_clk.value:
                await asyncio.sleep(
                    self.POLL_YIELD
                )  # Sleep until the Hub has read the last bits on the rising edge.
                # Wait for the Hub to finish reading the last bits before releasing the bus.
            self.output_state_pin.off()
        finally:
            # Always release the bus, even if an exception is raised.
            while self.input_clk.value:  # Wait for the Hub to finish reading the last bits before releasing the bus.
                await asyncio.sleep(self.POLL_YIELD)
            self.output_state_pin.off()
            self.output_clk.off()
            for pin in self.write_pins:
                pin.off()

    # ------------------------------------------------------------------
    # Helpers
    # ------------------------------------------------------------------

    def ready_to_read(self) -> bool:
        """Return True when the Control Hub is signalling it has data to send."""
        return bool(self.input_state_pin.value)

    def get_data_from_buffer(self, latest_only: bool = False):
        """
        Retrieve data from the receive buffer.

        latest_only=True  → most-recently received value, or None if empty.
        latest_only=False → a list copy of the entire buffer (oldest first).
        """
        if latest_only:
            return self.buffer[-1] if self.buffer else None
        return self.buffer[0]

    def close(self) -> None:
        """Release all GPIO pins."""
        for pin in self.read_pins:
            pin.close()
        for pin in self.write_pins:
            pin.close()
        self.input_clk.close()
        self.input_state_pin.close()
        self.output_state_pin.close()

    def __enter__(self) -> "KCBUS":
        return self

    def __exit__(self, *_) -> None:
        self.close()

    # ------------------------------------------------------------------
    # Background receive loop
    # ------------------------------------------------------------------

    async def loop(self) -> None:
        """
        Continuously poll for incoming data and append it to the buffer.

        Intended to run as a background asyncio task:
            asyncio.create_task(bus.loop())

        The buffer is bounded by BUFFER_MAX; oldest entries are evicted
        automatically (via deque maxlen).
        """

        while True:
            # Toggle the output clock at the specified frequency
            if self.ready_to_read():
                data = await self.read()
                self.buffer.append(data)
            else:
                await asyncio.sleep(self.POLL_YIELD)


def _read_char(timeout: float = 0.1) -> str | None:
    fd = sys.stdin.fileno()
    ready, _, _ = select.select([fd], [], [], timeout)
    if not ready:
        return None
    return sys.stdin.read(1)


def _read_keypress(timeout: float = 0.1) -> str | None:
    first = _read_char(timeout)
    if first is None:
        return None
    if first != "\x1b":
        if first == "\x03":
            return "CTRL_C"
        if first.lower() == "q":
            return "QUIT"
        return first.upper()

    escape_map = {"A": "UP", "B": "DOWN", "C": "RIGHT", "D": "LEFT"}
    second = _read_char(0.05)
    if second != "[":
        return None
    third = _read_char(0.05)
    if third in escape_map:
        return escape_map[third]
    if third != "1":
        return None
    if _read_char(0.05) != ";":
        return None
    modifier = _read_char(0.05)
    arrow = _read_char(0.05)
    if modifier == "2" and arrow in escape_map:
        return f"SHIFT_{escape_map[arrow]}"
    return None


def _compute_wheel_speeds(active_keys: set[str]) -> tuple[int, int] | None:
    boost = "SHIFT" in active_keys
    base_speed = 90 if boost else 50
    turn_delta = 35 if boost else 25

    forward = "UP" in active_keys
    left_turn = "LEFT" in active_keys
    right_turn = "RIGHT" in active_keys
    stop = "DOWN" in active_keys

    if forward:
        if left_turn:
            left_speed = max(0, base_speed - turn_delta)
            right_speed = min(127, base_speed + turn_delta)
        elif right_turn:
            left_speed = min(127, base_speed + turn_delta)
            right_speed = max(0, base_speed - turn_delta)
        else:
            left_speed = right_speed = base_speed
    elif left_turn:
        left_speed = 0
        right_speed = base_speed
    elif right_turn:
        left_speed = base_speed
        right_speed = 0
    elif stop:
        left_speed = right_speed = 0
    else:
        return None

    return left_speed, right_speed


def _set_terminal_raw_mode() -> tuple:
    fd = sys.stdin.fileno()
    old_settings = termios.tcgetattr(fd)
    tty.setcbreak(fd)
    return old_settings


def _restore_terminal_mode(old_settings: tuple) -> None:
    termios.tcsetattr(sys.stdin.fileno(), termios.TCSADRAIN, old_settings)


# ---------------------------------------------------------------------------
# Example usage
# ---------------------------------------------------------------------------


async def main():
    with KCBUS(
        read_pins=[5, 6],
        write_pins=[23, 24],
        input_clk=13,
        output_clk=25,
        output_clk_freq=0.1,
        input_state_pin=19,
        output_state_pin=16,
    ) as bus:

        async def send_wheel_speeds(left_speed: int, right_speed: int):
            await bus.write(left_speed, bit_length=16)
            print(f"Sent left: {left_speed}")
            await asyncio.sleep(0.02)
            await bus.write(128 + right_speed, bit_length=16)
            print(f"Sent right: {128 + right_speed}")

        async def control_with_keyboard():
            print("Use arrow keys to control the robot. Press q or Ctrl-C to quit.")
            old_settings = _set_terminal_raw_mode()
            key_timestamps: dict[str, float] = {}
            try:
                while True:
                    key = await asyncio.get_running_loop().run_in_executor(
                        None, _read_keypress, 0.1
                    )
                    now = time.monotonic()

                    if key in {"QUIT", "CTRL_C"}:
                        break
                    if key is not None:
                        if key.startswith("SHIFT_"):
                            key_timestamps["SHIFT"] = now
                            key_timestamps[key[len("SHIFT_") :]] = now
                        elif key in {"UP", "DOWN", "LEFT", "RIGHT"}:
                            key_timestamps[key] = now

                    # Remove keys that are no longer being held.
                    key_timestamps = {
                        k: timestamp
                        for k, timestamp in key_timestamps.items()
                        if now - timestamp <= 0.25
                    }
                    active_keys = set(key_timestamps)

                    speeds = _compute_wheel_speeds(active_keys)
                    if speeds is not None:
                        left_speed, right_speed = speeds
                        await send_wheel_speeds(left_speed, right_speed)
                    else:
                        await send_wheel_speeds(0, 0)
            finally:
                _restore_terminal_mode(old_settings)
                print("Terminal restored.")

        async def display_received_data():
            while True:
                latest = bus.get_data_from_buffer(latest_only=True)
                if latest is not None:
                    print(f"Received: {latest}")
                await asyncio.sleep(2)

        asyncio.create_task(bus.loop())
        await asyncio.gather(control_with_keyboard(), display_received_data())


if __name__ == "__main__":
    asyncio.run(main())
