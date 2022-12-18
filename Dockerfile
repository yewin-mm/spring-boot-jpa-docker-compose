# For details explanation of Dockerfile keyword,
# You can reference in here: https://github.com/yewin-mm/spring-boot-docker-sample/blob/master/Dockerfile
FROM openjdk:8-jdk-alpine
WORKDIR /opt/app
COPY target/spring-boot-jpa-docker-compose-0.0.1-SNAPSHOT.jar  app.jar
ENTRYPOINT ["java","-jar","app.jar"]