FROM openjdk:11
EXPOSE 8080
ADD target/my-product-service-0.0.1-SNAPSHOT.jar my-product-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/my-product-service-0.0.1-SNAPSHOT.jar"]
