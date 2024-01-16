# Stage 1: Build the application
FROM openjdk:11-jdk-slim as build

# Set the working directory in the Docker image
WORKDIR /app

# Copy Gradle executable and configuration files
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .

# Grant execution permissions to the Gradle wrapper
RUN chmod +x ./gradlew

# Copy source code
COPY src src

# Build the application
RUN ./gradlew build -x test

# Stage 2: Run the application
FROM openjdk:11-jre-slim

# Copy the jar file from the build stage
COPY --from=build /app/build/libs/*.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]
