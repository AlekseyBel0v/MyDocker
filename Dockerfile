FROM eclipse-temurin:17-alpine

EXPOSE 8080

COPY target/MyDocker-0.0.1-SNAPSHOT.jar docker.jar

CMD ["java", "-jar", "docker.jar"]