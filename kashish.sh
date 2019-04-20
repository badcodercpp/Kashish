#!/bin/bash
echo "hey kashish this script will help you to learn bash"
echo "compiling java"
javac -cp ".:./dependencies/jsoup-1.12.1-SNAPSHOT.jar" Invoke.java
echo "sleeping for a while"
sleep 1
echo "executing java"
java -cp ".:./dependencies/jsoup-1.12.1-SNAPSHOT.jar" Invoke
echo $OK
