#!/bin/bash
echo "hey kashish this script will help you to learn bash"
echo "compiling java"
javac -cp ".:./dependencies/jsoup-1.12.1-SNAPSHOT.jar" Invoke.java
echo "sleeping for a while"
sleep 1
echo "executing java"
declare -r HTMLTAGTEXT=`java -cp ".:./dependencies/jsoup-1.12.1-SNAPSHOT.jar" Invoke`
declare -r NULLY="ERROR"
if [ "$HTMLTAGTEXT" == "$NULLY" ]; then
    javac -cp ".:./dependencies/jsoup-1.12.1-SNAPSHOT.jar" Db.java
    sleep 1
    declare -r ERROR=`java -cp ".:./dependencies/jsoup-1.12.1-SNAPSHOT.jar" Db $HTMLTAGTEXT`
else
    javac -cp ".:./dependencies/jsoup-1.12.1-SNAPSHOT.jar" Db.java
    sleep 1
    declare -r RESULT=`java -cp ".:./dependencies/jsoup-1.12.1-SNAPSHOT.jar" Db $HTMLTAGTEXT`
fi
echo $RESULT
echo $ERROR
echo "done"
