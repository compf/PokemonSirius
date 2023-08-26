#!/bin/sh -l
echo "hallo $1 $0 welt "
java --version
gradle teamBuilder:run --args="$INPUT_SEED" --stacktrace

