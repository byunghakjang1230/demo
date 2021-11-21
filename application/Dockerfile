FROM openjdk:11-jdk-oracle
ARG SERVER_PORT
ARG APP_IP
ENV SERVER_PORT=${SERVER_PORT:-8080}
ENV APP_IP=${APP_IP:-nginx-back}
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "-Dapp.ip=${APP_IP}", "-Dserver.port=${SERVER_PORT}", "/app.jar"]