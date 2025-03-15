# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the local machine to the container's working directory
COPY ./target/spring-simple-0.0.1-SNAPSHOT.jar /app/xyz.jar

EXPOSE 8001

# Command to run the application
CMD ["java", "-jar", "/app/xyz.jar"]