"""
KCBUS — Kevon Clarke BUS
Custom 2-bit parallel bus for communication between a Raspberry Pi and a
REV Robotics Control Hub.

Dependencies: gpiozero (pre-installed on Raspberry Pi OS)
"""

import asyncio
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
    clock_pin        : GPIO input   — clock driven by the Control Hub.
    input_state_pin  : GPIO input   — Control Hub asserts HIGH when it wants
                       to send data to the Pi.
    output_state_pin : GPIO output  — Pi asserts HIGH when it wants to send
                       data to the Control Hub.
    """

    BUFFER_MAX          = 5
    POLL_YIELD          = 0        # seconds; 0 = yield without sleeping
    READ_TIMEOUT_YIELDS = 100_000  # abort read after this many poll iterations

    def __init__(
        self,
        read_pins: list[int],
        write_pins: list[int],
        clock_pin: int,
        input_state_pin: int,
        output_state_pin: int,
    ):
        if len(read_pins) != 2 or len(write_pins) != 2:
            raise ValueError("read_pins and write_pins must each have exactly 2 entries.")

        self.buffer: deque[int] = deque(maxlen=self.BUFFER_MAX)

        # Inputs (inverted because the Control Hub uses active-low signalling)
        self.read_pins       = [DigitalInputDevice(pin) for pin in read_pins]
        self.clock_pin       = DigitalInputDevice(clock_pin)
        self.input_state_pin = DigitalInputDevice(input_state_pin)

        # Outputs — start LOW in logical terms, but use inverted GPIO polarity
        self.write_pins       = [OutputDevice(pin, initial_value=False, active_high=False) for pin in write_pins]
        self.output_state_pin = OutputDevice(output_state_pin, initial_value=False, active_high=False)

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
        data         = 0
        bit_position = 0
        prev_clock   = self.clock_pin.value
        yields       = 0

        while self.input_state_pin.value:
            curr_clock = self.clock_pin.value

            if curr_clock and not prev_clock:  # Rising edge in logical terms
                for pin in reversed(self.read_pins):
                    # The MSB of the data comes in first, so fix the code below to shift the bits into the correct position.
                    data = (data << 1) | pin.value
                    #print(f"Data: {data:#010b}, bit_position: {bit_position}, pin.value: {pin.value}")
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
        remaining  = bit_length
        prev_clock = self.clock_pin.value

        try:
            while remaining > 0:
                curr_clock = self.clock_pin.value
                if not curr_clock and prev_clock:
                    # Preset the data pins for the next rising edge. The MSB of the data goes on the first pin, so shift the bits accordingly.
                    self.output_state_pin.on() # This is when you indicate to the hub that you have data to send. It should be held HIGH for the entire duration of the transfer.
                    for i, pin in enumerate(reversed(self.write_pins)):
                        bit_index = remaining - 1 - i
                        bit = (data >> bit_index) & 0x01 if bit_index >= 0 else 0
                        pin.value = bit
                    remaining -= len(self.write_pins)

                prev_clock = curr_clock
                await asyncio.sleep(self.POLL_YIELD)
        finally:
            # Always release the bus, even if an exception is raised.
            self.output_state_pin.off()
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
        self.clock_pin.close()
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
            
            if self.ready_to_read():
                data = await self.read()
                self.buffer.append(data)
            else:
                await asyncio.sleep(self.POLL_YIELD)


# ---------------------------------------------------------------------------
# Example usage
# ---------------------------------------------------------------------------

async def main():
    with KCBUS(
        read_pins=[5, 6],
        write_pins=[20, 21],
        clock_pin=13,
        input_state_pin=19,
        output_state_pin=16,
    ) as bus:
        async def send_data_periodically():
            x = 0
            while True:
                print(f"Sending: {x}")
                await bus.write(x, bit_length=16)
                await asyncio.sleep(2)
                x = (x + 1) % 65536  # Wrap around at 16 bits
        asyncio.create_task(bus.loop())
        asyncio.create_task(send_data_periodically())

        # Send 8 bits to the Control Hub.
        await bus.write(10, bit_length=4)

        # Main application loop.
        while True:
            latest = bus.get_data_from_buffer(latest_only=True)
            if latest is not None:
                pass
                print(f"Received: {latest}")
            await asyncio.sleep(2)


if __name__ == "__main__":
    asyncio.run(main())
