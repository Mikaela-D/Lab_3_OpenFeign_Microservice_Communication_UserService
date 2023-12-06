FROM openjdk:20-jdk-slim

WORKDIR /app

COPY target/Lab3_UserService-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "Lab3_UserService-0.0.1-SNAPSHOT.jar"]