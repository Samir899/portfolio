# Use an official JDK 21 runtime image
FROM eclipse-temurin:21-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container
COPY build/libs/*.jar app.jar

# Expose the application's port (default for Spring Boot is 8080)
EXPOSE 80

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
