FROM openjdk:8
EXPOSE 9002
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]