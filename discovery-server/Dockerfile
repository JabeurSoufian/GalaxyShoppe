FROM openjdk:17
COPY target/discovery-server-0.0.1-SNAPSHOT.jar /eureka_server.jar
EXPOSE 9102
ENTRYPOINT ["java","-jar","/eureka_server.jar"]