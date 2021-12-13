FROM openjdk:11-jdk-oracle
ARG JAR_FILE=application/build/libs/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
