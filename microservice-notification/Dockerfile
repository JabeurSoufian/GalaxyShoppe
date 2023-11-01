FROM openjdk:17
VOLUME /tmp
COPY target/microservice-notification-0.0.1-SNAPSHOT.jar /microservice-notification.jar
EXPOSE 9004
ENTRYPOINT ["java","-jar","/microservice-notification.jar"]