FROM openjdk:8-jdk-alpine
COPY target/simple-service-1.0.0.jar /
EXPOSE 18888
ENTRYPOINT ["java", "-jar", "simple-service-1.0.0.jar"]
