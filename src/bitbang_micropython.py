import sys
import select
import uasyncio as asyncio
from machine import Pin

class KCBUS:
    def __init__(self, read_pins, write_pins, input_clk, output_clk, input_state_pin, output_state_pin):
        # Configure Pins
        self.read_pins = [Pin(p, Pin.IN) for p in read_pins]
        self.write_pins = [Pin(p, Pin.OUT, value=0) for p in write_pins]
        
        self.input_clk = Pin(input_clk, Pin.IN)
        self.input_state_pin = Pin(input_state_pin, Pin.IN)
        
        self.output_clk = Pin(output_clk, Pin.OUT, value=0)
        self.output_state_pin = Pin(output_state_pin, Pin.OUT, value=0)
        
        self.buffer = []
        self.buffer_max = 5

    async def read(self):
        data = 0
        prev_clock = self.input_clk.value()
        yields = 0

        while self.input_state_pin.value():
            curr_clock = self.input_clk.value()
            if curr_clock and not prev_clock:  # Rising edge
                for pin in reversed(self.read_pins):
                    data = (data << 1) | pin.value()
            
            prev_clock = curr_clock
            await asyncio.sleep(0)
            yields += 1
            if yields >= 100000:  # Timeout safety
                break  
        return data

    async def write(self, data, bit_length):
        remaining = bit_length
        try:
            clock_state = self.input_clk.value()
            prev_clock = clock_state
            
            while remaining > 0:
                self.output_state_pin.value(1)
                clock_state = self.input_clk.value()
                
                # Falling edge write
                if not clock_state and prev_clock:
                    for i, pin in enumerate(reversed(self.write_pins)):
                        bit_index = remaining - 1 - i
                        val = (data >> bit_index) & 0x01 if bit_index >= 0 else 0
                        pin.value(val)
                    remaining -= len(self.write_pins)
                    
                prev_clock = clock_state
                await asyncio.sleep(0)
                
            # Wait for final read
            while not self.input_clk.value():
                await asyncio.sleep(0)
            self.output_state_pin.value(0)
            
        finally:
            while self.input_clk.value():
                await asyncio.sleep(0)
            self.output_state_pin.value(0)
            for pin in self.write_pins:
                pin.value(0)

    async def receive_loop(self):
        while True:
            if self.input_state_pin.value():
                data = await self.read()
                self.buffer.append(data)
                if len(self.buffer) > self.buffer_max:
                    self.buffer.pop(0)
                # Print received data so the Pi can optionally read it
                print(f"R:{data}") 
            await asyncio.sleep(0)

# ==========================================
# Main MicroPython Routine
# ==========================================
async def main():
    # Update these PIN NUMBERS to match your MicroPython board's wiring
    bus = KCBUS(
        read_pins=[4, 5], 
        write_pins=[14, 15], 
        input_clk=16, 
        output_clk=17, 
        input_state_pin=18, 
        output_state_pin=19
    )
    
    asyncio.create_task(bus.receive_loop())
    
    # Setup non-blocking reading from USB Serial (sys.stdin)
    poller = select.poll()
    poller.register(sys.stdin, select.POLLIN)
    
    print("MicroPython KCBUS Ready.")
    
    while True:
        # Check if the Pi sent data over USB/Serial
        res = poller.poll(0) 
        if res:
            line = sys.stdin.readline().strip()
            # Expecting format "W:left_speed,right_speed"
            if line.startswith("W:"):
                try:
                    parts = line[2:].split(',')
                    left_speed = int(parts[0])
                    right_speed = int(parts[1])
                    
                    # Write to the Control Hub
                    await bus.write(left_speed, 16)
                    await asyncio.sleep_ms(20) # 0.02s gap
                    await bus.write(128 + right_speed, 16)
                except ValueError:
                    pass
        
        await asyncio.sleep(0)

if __name__ == "__main__":
    asyncio.run(main())
