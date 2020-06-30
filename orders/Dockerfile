FROM adoptopenjdk/openjdk11:jdk-11.0.7_10-alpine

VOLUME /tmp

COPY target/*.jar orders-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/orders-0.0.1-SNAPSHOT.jar"]

EXPOSE 8001