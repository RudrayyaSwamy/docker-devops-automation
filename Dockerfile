FROM openjdk:21
EXPOSE 8081
ADD target/docker-devops-automation.jar docker-devops-automation.jar
ENTRYPOINT ["java","-jar","/docker-devops-automation.jar"]