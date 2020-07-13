FROM openjdk:8
EXPOSE 8086
ADD target/topic-manager-docker.jar topic-manager-docker.jar
ENTRYPOINT ["java","-jar","/topic-manager-docker.jar"]

