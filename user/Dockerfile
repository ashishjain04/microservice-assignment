FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY target/*.jar user-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/user-0.0.1-SNAPSHOT.jar"]

EXPOSE 8000