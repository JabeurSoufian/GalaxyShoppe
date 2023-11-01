FROM openjdk:17
VOLUME /tmp
COPY target/config-server-0.0.1-SNAPSHOT.jar /config-server.jar
EXPOSE 9101
ENTRYPOINT ["java","-jar","/config-server.jar"]