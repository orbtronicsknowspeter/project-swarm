default:
	@just --list

launch-android-emulator name="Pixel_7_API35":
	emulator -avd {{ name }}

quarto-preview:
	@quarto preview

quarto-render:
	@quarto render
