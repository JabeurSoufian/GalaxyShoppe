FROM openjdk:17
VOLUME /tmp
COPY target/microservice-order-0.0.1-SNAPSHOT.jar /microservice-order.jar
EXPOSE 9002
ENTRYPOINT ["java","-jar","/microservice-order.jar"]