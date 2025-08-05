FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/*.jar docker-app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "docker-app.jar"]
