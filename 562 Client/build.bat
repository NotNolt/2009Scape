@echo off
cd .
javac -cp libs/clientlibs.jar; -deprecation -d bin -sourcepath src src/*.java
pause
