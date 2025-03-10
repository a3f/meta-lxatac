# Auto-Generated by cargo-bitbake 0.3.16-alpha.0
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get py-spy could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/py-spy/0.3.9"
SRC_URI += "git://github.com/benfred/py-spy;protocol=https;nobranch=1"
SRCREV = "eb24fb949e80c102580ced09f34f4246efb63018"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.14.1 \
    crate://crates.io/addr2line/0.16.0 \
    crate://crates.io/adler/0.2.3 \
    crate://crates.io/ahash/0.3.8 \
    crate://crates.io/ahash/0.4.7 \
    crate://crates.io/ahash/0.6.2 \
    crate://crates.io/aho-corasick/0.7.15 \
    crate://crates.io/ansi_term/0.11.0 \
    crate://crates.io/anyhow/1.0.42 \
    crate://crates.io/arrayvec/0.4.12 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.0.1 \
    crate://crates.io/backtrace/0.3.55 \
    crate://crates.io/benfred-read-process-memory/0.2.1 \
    crate://crates.io/bindgen/0.53.3 \
    crate://crates.io/bitflags/1.2.1 \
    crate://crates.io/bytemuck/1.4.1 \
    crate://crates.io/cc/1.0.66 \
    crate://crates.io/cexpr/0.4.0 \
    crate://crates.io/cfg-if/0.1.10 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.19 \
    crate://crates.io/clang-sys/0.29.3 \
    crate://crates.io/clap/2.33.3 \
    crate://crates.io/console/0.14.0 \
    crate://crates.io/const-random-macro/0.1.13 \
    crate://crates.io/const-random/0.1.13 \
    crate://crates.io/cpp_demangle/0.3.2 \
    crate://crates.io/crc32fast/1.2.1 \
    crate://crates.io/crossbeam-channel/0.5.0 \
    crate://crates.io/crossbeam-utils/0.8.1 \
    crate://crates.io/crunchy/0.2.2 \
    crate://crates.io/ctrlc/3.1.7 \
    crate://crates.io/dashmap/3.11.10 \
    crate://crates.io/encode_unicode/0.3.6 \
    crate://crates.io/env_logger/0.7.1 \
    crate://crates.io/env_logger/0.8.2 \
    crate://crates.io/env_logger/0.9.0 \
    crate://crates.io/errno-dragonfly/0.1.1 \
    crate://crates.io/errno/0.2.7 \
    crate://crates.io/failure/0.1.8 \
    crate://crates.io/failure_derive/0.1.8 \
    crate://crates.io/fallible-iterator/0.2.0 \
    crate://crates.io/flate2/1.0.19 \
    crate://crates.io/gcc/0.3.55 \
    crate://crates.io/getrandom/0.1.16 \
    crate://crates.io/getrandom/0.2.1 \
    crate://crates.io/gimli/0.23.0 \
    crate://crates.io/gimli/0.25.0 \
    crate://crates.io/glob/0.3.0 \
    crate://crates.io/goblin/0.4.1 \
    crate://crates.io/hashbrown/0.9.1 \
    crate://crates.io/heck/0.3.2 \
    crate://crates.io/hermit-abi/0.1.17 \
    crate://crates.io/humantime/1.3.0 \
    crate://crates.io/humantime/2.0.1 \
    crate://crates.io/indexmap/1.6.1 \
    crate://crates.io/indicatif/0.15.0 \
    crate://crates.io/inferno/0.10.6 \
    crate://crates.io/itoa/0.4.7 \
    crate://crates.io/kernel32-sys/0.2.2 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/lazycell/1.3.0 \
    crate://crates.io/libc/0.2.98 \
    crate://crates.io/libloading/0.5.2 \
    crate://crates.io/libm/0.2.1 \
    crate://crates.io/libproc/0.9.1 \
    crate://crates.io/log/0.4.11 \
    crate://crates.io/lru/0.6.3 \
    crate://crates.io/mach/0.3.2 \
    crate://crates.io/mach_o_sys/0.1.1 \
    crate://crates.io/memchr/2.4.0 \
    crate://crates.io/memmap/0.7.0 \
    crate://crates.io/memoffset/0.6.4 \
    crate://crates.io/miniz_oxide/0.4.3 \
    crate://crates.io/nix/0.18.0 \
    crate://crates.io/nix/0.22.0 \
    crate://crates.io/nodrop/0.1.14 \
    crate://crates.io/nom/5.1.2 \
    crate://crates.io/num-format/0.4.0 \
    crate://crates.io/num-integer/0.1.44 \
    crate://crates.io/num-traits/0.2.14 \
    crate://crates.io/num_cpus/1.13.0 \
    crate://crates.io/number_prefix/0.3.0 \
    crate://crates.io/object/0.22.0 \
    crate://crates.io/object/0.26.0 \
    crate://crates.io/peeking_take_while/0.1.2 \
    crate://crates.io/plain/0.2.3 \
    crate://crates.io/ppv-lite86/0.2.10 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro-hack/0.5.19 \
    crate://crates.io/proc-macro2/1.0.24 \
    crate://crates.io/proc-maps/0.1.9 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quick-xml/0.20.0 \
    crate://crates.io/quote/1.0.8 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand/0.8.1 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_chacha/0.3.0 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_core/0.6.1 \
    crate://crates.io/rand_distr/0.4.0 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/rand_hc/0.3.0 \
    crate://crates.io/redox_syscall/0.1.57 \
    crate://crates.io/regex-syntax/0.6.22 \
    crate://crates.io/regex/1.4.3 \
    crate://crates.io/remoteprocess/0.4.4 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/rgb/0.8.25 \
    crate://crates.io/rustc-demangle/0.1.18 \
    crate://crates.io/rustc-hash/1.1.0 \
    crate://crates.io/ryu/1.0.5 \
    crate://crates.io/scroll/0.10.2 \
    crate://crates.io/scroll_derive/0.10.4 \
    crate://crates.io/serde/1.0.118 \
    crate://crates.io/serde_derive/1.0.118 \
    crate://crates.io/serde_json/1.0.61 \
    crate://crates.io/shlex/0.1.1 \
    crate://crates.io/smallvec/1.6.1 \
    crate://crates.io/stable_deref_trait/1.2.0 \
    crate://crates.io/str_stack/0.1.0 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/structopt-derive/0.4.14 \
    crate://crates.io/structopt/0.3.21 \
    crate://crates.io/syn/1.0.58 \
    crate://crates.io/synstructure/0.12.4 \
    crate://crates.io/tempfile/3.1.0 \
    crate://crates.io/term_size/0.3.2 \
    crate://crates.io/termcolor/1.1.2 \
    crate://crates.io/terminal_size/0.1.15 \
    crate://crates.io/termios/0.3.3 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/thread_local/1.1.0 \
    crate://crates.io/time/0.1.44 \
    crate://crates.io/tiny-keccak/2.0.2 \
    crate://crates.io/unicode-segmentation/1.7.1 \
    crate://crates.io/unicode-width/0.1.8 \
    crate://crates.io/unicode-xid/0.2.1 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/version_check/0.9.2 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
    crate://crates.io/which/3.1.1 \
    crate://crates.io/winapi-build/0.1.1 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.2.8 \
    crate://crates.io/winapi/0.3.9 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=8e693cca9623535fae2cbca0937ddda6 \
"

SUMMARY = "Sampling profiler for Python programs"
HOMEPAGE = "https://github.com/benfred/py-spy"
LICENSE = "MIT"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include py-spy-${PV}.inc
include py-spy.inc
