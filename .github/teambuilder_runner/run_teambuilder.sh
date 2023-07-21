#!/bin/sh -l
echo "hallo $1"
gradle teamBuilder:run --args="$1"

