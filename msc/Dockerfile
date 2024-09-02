FROM openjdk:17-slim
WORKDIR /app
VOLUME /tmp
EXPOSE 8083
ARG JAR_FILE=target/msc-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
