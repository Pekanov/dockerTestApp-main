# Используем официальный образ OpenJDK
FROM openjdk:17-jdk-slim

# Устанавливаем рабочую директорию в контейнере
WORKDIR /app

# Копируем JAR файл в контейнер
COPY target/DockerTestApp.jar /app/DockerTestApp.jar

# Открываем порт, на котором будет работать приложение
EXPOSE 8080

# Запускаем Spring Boot приложение
ENTRYPOINT ["java", "-jar", "/app/DockerTestApp.jar"]
