# Dockerfile for msa

FROM openjdk:17-slim
WORKDIR /app
VOLUME /tmp
EXPOSE 8081
ARG JAR_FILE=target/msa-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
