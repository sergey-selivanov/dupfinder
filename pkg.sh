#!/bin/sh

jpackage \
--module-path build/install/hellofx/lib \
--module hellofx/org.openjfx.MainApp \
 \
--verbose \
--dest build/install \
--name "HelloFX-Test-Application" \
--app-version "1.0.0" \
--icon src/main/resources/images/amor.png \
--vendor "Svs"

