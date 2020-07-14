FROM openjdk:8
ADD target/topic-manager-docker.jar topic-manager-docker.jar
ENTRYPOINT ["java","-jar","/topic-manager-docker.jar"]

