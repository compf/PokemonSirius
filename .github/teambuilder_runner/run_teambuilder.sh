#!/bin/sh -l
echo "hallo $1 $0 welt $INPUT_SEED"
printenv
gradle teamBuilder:run --args="$1"

