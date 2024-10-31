# Use an OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

# Set the entrypoint to run the application
ENTRYPOINT ["java", "-jar", "/app/demo.jar"]
