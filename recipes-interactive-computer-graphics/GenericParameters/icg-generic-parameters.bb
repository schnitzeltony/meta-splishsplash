SUMMARY = "GenericParameters is a C++ header library to define generic parameters"
HOMEPAGE = "http://www.interactive-graphics.de/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4f02b7bb2aa03377bfafe1938109ec70"

SRC_URI = "git://github.com/InteractiveComputerGraphics/GenericParameters.git"
PV = "1.0.0+git${SRCPV}"
SRCREV = "89ae733fb8b8b9df25d0e44a0e49e51136901e8c"
S = "${WORKDIR}/git"

inherit cmake
