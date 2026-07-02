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

        # link loading
        ld_pkgs = with pkgs; [
          libcap
          stdenv.cc.cc
          openssl
          openxr-loader
          # numpy / opencv-python / ultralytics wheels
          zlib
          libglvnd
          glib
          fontconfig
          freetype
          libxkbcommon
          dbus
          xorg.libX11
          xorg.libXext
          xorg.libxcb
          xcb-util-cursor
          xorg.xcbutilimage
          xorg.xcbutilkeysyms
          xorg.xcbutilrenderutil
          xorg.xcbutilwm
        ];

        # compilers & runtimes
        runtime_pkgs = with pkgs; [
          androidsdk
          dotnet-sdk_9
          pnpm
          nodejs
          uv
        ];

        dev_pkgs = with pkgs; [
          alvr
          android-tools
          blender
          claude-code
          cmake
          ghidra
          jadx
          just
          p7zip
          platformio
          quarto
          termshark
          unityhub
          unity-test
          wireshark
        ];

        doc_pkgs = with pkgs; [
          quarto
          typst
        ];

        treefmt_pkgs = with pkgs; [
          treefmt
          clang-tools
          cmake-format
          nixfmt
          prettier
          ruff
          taplo
        ];
      in
      {
        devShells = {
          default = pkgs.mkShell {
            packages = [ ] ++ treefmt_pkgs ++ doc_pkgs ++ dev_pkgs ++ runtime_pkgs;

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
          treefmt = pkgs.mkShell {
            packages =
              with pkgs;
              [
                just
              ]
              ++ treefmt_pkgs;
          };
        };
      }
    );
}
