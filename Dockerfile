#FROM openjdk:8-jdk-alpine
ARG base_image
FROM ${base_image}
COPY target/simple-service-1.0.0.jar /
EXPOSE 80
ENTRYPOINT ["java", "-jar", "simple-service-1.0.0.jar"]
