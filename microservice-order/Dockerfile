FROM openjdk:17
COPY target/microservice-order-0.0.1-SNAPSHOT.jar /microservice_order.jar
EXPOSE 9002
ENTRYPOINT ["java","-jar","/microservice_order.jar"]