#!/bin/sh
docker build . -t dl2.homeawaycorp.com/eg-data-platform/graalvm-sample
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run -p 8086:8086 graalvm-sample"
