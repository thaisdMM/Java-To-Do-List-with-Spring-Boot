FROM maven:3.9-eclipse-temurin-17 AS build

COPY . .
RUN mvn clean install

FROM eclipse-temurin:17-jre
EXPOSE 8080

COPY --from=build /target/todolist-1.0.0.jar app.jar

ENTRYPOINT [ "java", "-jar", "app.jar" ]
