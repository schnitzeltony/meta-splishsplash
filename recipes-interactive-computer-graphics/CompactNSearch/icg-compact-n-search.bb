SUMMARY = "C++ library for parallel computation of neighboring points"
DESCRIPTION = "CompactNSearch is a C++ library for parallel computation of neighboring points in a fixed radius in a three-dimensional point cloud"
HOMEPAGE = "http://www.interactive-graphics.de/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=08a56d031a191ef965e9b1acd8f3f74d"

SRC_URI = "git://github.com/InteractiveComputerGraphics/CompactNSearch.git"
PV = "1.0.0+git${SRCPV}"
SRCREV = "b8c41fcefd6a8a7896cf3972dcb92aa407969ed7"
S = "${WORKDIR}/git"

inherit cmake
