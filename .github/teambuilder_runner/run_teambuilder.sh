#!/bin/sh -l
echo "hallo $1 $0 welt "
printenv
gradle teamBuilder:run --args="$INPUT_SEED"

