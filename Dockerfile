
# Use a Maven image to build the project
FROM maven:3.8.5-openjdk-17 AS build

# Set the working directory in the container
WORKDIR /app

# Copy the Maven project file
COPY pom.xml .

# Download dependencies (this step is cached if pom.xml is unchanged)
RUN mvn dependency:go-offline

# Copy the rest of the project files
COPY src ./src

# Package the Spring Boot application
RUN mvn package -DskipTests

# Use a smaller image for the final application
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port the application runs on
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

