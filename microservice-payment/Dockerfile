FROM openjdk:17
VOLUME /tmp
COPY target/microservice-payment-0.0.1-SNAPSHOT.jar /microservice-payment.jar
EXPOSE 9003
ENTRYPOINT ["java","-jar","/microservice-payment.jar"]