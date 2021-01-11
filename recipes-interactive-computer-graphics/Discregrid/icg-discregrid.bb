SUMMARY = "C++ library to generate of discrete functions on a box-shaped domain"
DESCRIPTION = "Discregrid is a C++ library for the generation of discrete functions on a box-shaped domain"
HOMEPAGE = "http://www.interactive-graphics.de/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=30f85b6f4f7124a9d9d13e882b9a0704"

SRC_URI = "git://github.com/InteractiveComputerGraphics/Discregrid.git"
PV = "1.0.0+git${SRCPV}"
SRCREV = "01a2de4c4486d64e5a54ab91c0677ffe9c16e1e4"
S = "${WORKDIR}/git"

DEPENDS = "libeigen"

inherit cmake
