FROM openjdk:17 as builder
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvn dependency:go-offline
COPY ./src ./src
RUN ./mvnw clean install 

FROM openjdk:17
LABEL version="1.0.0"
EXPOSE 8080:8080
WORKDIR /app
COPY target/ananda-java.jar /app/ananda-java.jar
ENTRYPOINT ["java", "-jar", "ananda-java.jar"]