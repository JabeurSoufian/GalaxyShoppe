FROM openjdk:17
VOLUME /tmp
COPY target/microservice-product-0.0.1-SNAPSHOT.jar /microservice-product.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","/microservice-product.jar"]