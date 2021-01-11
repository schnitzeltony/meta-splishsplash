SUMMARY = "Library to simulate rigid bodies, deformable solids and fluids"
DESCRIPTION = "PositionBasedDynamics is a library for the physically-based simulation of rigid bodies, deformable solids and fluids"
HOMEPAGE = "http://www.interactive-graphics.de/"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=010920354b4e542ca1b73b1f2bd34906"

SRC_URI = " \
    git://github.com/InteractiveComputerGraphics/PositionBasedDynamics.git \
    file://0001-Do-not-set-march-native.patch \
"
PV = "1.0.0+git${SRCPV}"
SRCREV = "c7180dc68277ed2c13916db84bb59d82ec0df803"
S = "${WORKDIR}/git"

DEPENDS = " \
    libeigen \
    freeglut \
    icg-generic-parameters \
    icg-discregrid \
"

inherit cmake

EXTRA_OECMAKE = " \
    -DGenericParameters_INCLUDE_DIR=${STAGING_INCDIR} \
    -DDiscregrid_INCLUDE_DIR=${STAGING_INCDIR} \
    -DDiscregrid_DEBUG_LIB=${STAGING_LIBDIR}/libDiscregrid.a \
    -DDiscregrid_LIB=${STAGING_LIBDIR}/libDiscregrid.a \
"


