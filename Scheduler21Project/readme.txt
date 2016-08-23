Migration to quartz.2.1.1 from 1.6.5

add following library to lib
  log4j-1.2.16.jar
  quartz-all-2.1.1.jar
  slf4j-api-1.6.1.jar
  slf4j-log4j12-1.6.1.jar

logging changed to logger. log4j.xml added.

weblogic.xml:  <prefer-web-inf-classes>true</prefer-web-inf-classes> added


Tested with 11g PS4(11.1.1.5)