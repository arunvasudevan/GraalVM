# GraalVM

This repository tests out some of the GraalVM features such as:
 1. Running polyglot applications 
 2. Executing native-image to achieve faster startup
 
 
 **Prerequisite** 
 Install GraalVM in your local - https://blog.softwaremill.com/graalvm-installation-and-setup-on-macos-294dd1d23ca2
 
 
 **Execute**
 
- `javac <filename.java>`
- `java -cp . <filename>`


**Commands**

- To Test Polyglot Code (GraalVM Console):

javac HelloPolyglot.java

java -cp . HelloPolyglot


- To see a Faster Startup:

**JVM Console**:

javac GraalVMTest.java

time java -cp . GraalVMTest


**GraalVM Console**

javac GraalVMTest.java

native-image -cp . GraalVMTest

time ./graalvmtest

You will see that the GraalVM native image started up much faster
