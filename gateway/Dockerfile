# Use a base image with JDK 17 (Java Development Kit)
FROM openjdk:17-slim

# Set the working directory inside the container
WORKDIR /app

# Expose the port the Spring Boot application will run on
EXPOSE 9090

# Define the path to the JAR file
ARG JAR_FILE=target/gateway-0.0.1-SNAPSHOT.jar

# Copy the JAR file into the container
COPY ${JAR_FILE} app.jar

# Set the entry point to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
