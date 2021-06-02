FROM tomcat:8.5-jdk11-slim

RUN rm -rf $CATALINA_HOME/webapps/*
COPY queenbo*.properties colemcolbo*.properties $CATALINA_HOME/webapps/
COPY /src/main/resources/log4j2.xml $CATALINA_HOME/webapps/
ADD /target/*.war $CATALINA_HOME/webapps/ROOT.war
