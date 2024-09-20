
FROM openjdk:17-jdk-slim
WORKDIR /app
ENV ARTIFACT_NAME=todo.jar

# JAR 파일 복사
COPY build/libs/todo-1.0.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-server", "-Djava.net.preferIPv4Stack=true", "-jar", "todo.jar"]