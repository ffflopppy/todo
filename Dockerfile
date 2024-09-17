
FROM openjdk:17-jdk-slim
WORKDIR /app
ENV ARTIFACT_NAME=todo.jar

COPY build/libs/$ARTIFACT_NAME .

EXPOSE 8080

ENTRYPOINT ["java", "-server", "-Djava.net.preferIPv4Stack=true", "-jar", "todo.jar"]