#!/bin/sh

if javac -d compiled *.java
then
  cd compiled
  java Run
fi
