gradle-spock-spring-example
===========================

An example web application that uses gradle, java spring, and spock with Geb. 

Installation
==============

To install and run the spring application run:

./gradlew tomcatRunWar

Or if you're on Windows, gradlew.bat tomcatRunWar

Running the Tests
=================

Then in a different process while tomcat is running (open a new terminal or shell session) and execute the tests via:

./gradlew test

(gradlew.bat test for window)

If you wish to only run the tests in Firefox or Chrome, run 

./gradlew firefoxTest
./gradlew chromeTest

Note that the tests are not meant to be exhaustive, but to give you an idea of how they are structured. Feel free to fork this repo and add further tests.
