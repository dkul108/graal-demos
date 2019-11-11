#!/bin/bash

JAVA_HOME=/home/shutty/apps/graalvm
native-image --no-fallback --allow-incomplete-classpath --report-unsupported-elements-at-runtime -cp ./target/scala-2.12/helloworld-assembly-0.1.0-SNAPSHOT.jar com.example.Hello