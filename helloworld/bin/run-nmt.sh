#!/bin/bash

java -cp target/scala-2.12/helloworld-assembly-0.1.0-SNAPSHOT.jar -Xmx20m -XX:NativeMemoryTracking=summary com.example.Hello