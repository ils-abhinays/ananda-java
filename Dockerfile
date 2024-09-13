FROM openjdk:17
LABEL version="1.0.0"
EXPOSE 8080:8080
WORKDIR /app
COPY target/ananda-java.jar /app/ananda-java.jar
ENTRYPOINT ["java", "-jar", "ananda-java.jar"]
