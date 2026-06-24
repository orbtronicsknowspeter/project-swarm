default:
	@just --list

launch-android-emulator name="Pixel_7_API35":
	emulator -avd {{ name }}

quarto-preview:
	@quarto preview

quarto-render:
	@quarto render

lint args="" config_file="./treefmt.lint.toml":
	@treefmt {{ args }} --config-file {{ config_file }}

format args="" config_file="./treefmt.toml":
	@treefmt {{ args }} --config-file {{ config_file }}
