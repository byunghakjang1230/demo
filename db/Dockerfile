FROM openjdk:11-jdk-oracle
ARG SERVER_PORT
ENV SERVER_PORT=${SERVER_PORT:-8080}
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "-Dserver.port=${SERVER_PORT}", "/app.jar"]