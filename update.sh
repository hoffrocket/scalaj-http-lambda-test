#!/bin/sh
aws lambda update-function-code --function-name scalaj-http-test --zip-file fileb://target/scala-2.12/scalaj-http-lambda-test-assembly-1.0.jar
