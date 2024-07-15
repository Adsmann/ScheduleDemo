FROM maven:3.9.4-eclipse-temurin-17 as build

COPY src src
COPY pom.xml pom.xml

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-alpine

RUN adduser --system spring-boot && addgroup --system spring-boot && adduser spring-boot spring-boot
USER spring-boot

WORKDIR /app

COPY --from=build target/demo-0.0.1-SNAPSHOT.jar ./application.jar

ENTRYPOINT ["java", "-jar", "./application.jar"]

#FROM openjdk:17-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ./target/demo-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]