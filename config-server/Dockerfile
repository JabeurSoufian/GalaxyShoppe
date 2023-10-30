FROM openjdk:17
COPY target/config-server-0.0.1-SNAPSHOT.jar /config_server.jar
EXPOSE 9101
ENTRYPOINT ["java","-jar","/config_server.jar"]