{
  description = "project-swarm";

  inputs = {
    nixpkgs = {
      url = "github:nixos/nixpkgs/nixpkgs-unstable";
    };

    flake-utils = {
      url = "github:numtide/flake-utils";
    };
  };

  outputs =
    {
      self,
      nixpkgs,
      flake-utils,
    }:
    flake-utils.lib.eachDefaultSystem (
      system:
      let
        pkgs = import nixpkgs {
          inherit system;

          config = {
            allowUnfree = true;
            android_sdk.accept_license = true;
          };
        };

        ld_pkgs = with pkgs; [
          libcap
          stdenv.cc.cc
          openssl
        ];
      in
      {
        devShells = {
          default = pkgs.mkShell {
            packages = with pkgs; [
              # compilers & runtimes
              androidsdk
              android-tools
              dotnet-sdk_9
              pnpm
              nodejs

              # dev tools
              alvr
              blender
              claude-code
							cmake
							ghidra
              jadx
              just
              openxr-loader
              p7zip
              platformio
              quarto
              termshark
              treefmt
              typst
              unityhub
              unity-test
              uv
              wireshark

              # formatters & linters
							clang-tools
							cmake-format
              nixfmt
              prettier
							ruff
              taplo
            ];

            NIX_LD = pkgs.stdenv.cc.bintools.dynamicLinker;

            NIX_LD_LIBRARY_PATH = pkgs.lib.makeLibraryPath ld_pkgs;

            buildInputs = ld_pkgs;

            shellHook = ''
              							export ANDROID_SDK_ROOT="${pkgs.androidsdk}/libexec/android-sdk"

              							if [[ ! -d .venv ]]; then
              							uv venv
              							fi

              							export PATH="$HOME/.local/bin:$PATH"

              							export QUARTO_PYTHON=./.venv/bin/python

              							source ./.venv/bin/activate

              							uv sync
              						'';
          };
        };
      }
    );
}