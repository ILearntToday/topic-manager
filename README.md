docker pull mysql 
docker run --name mysql-standalone -p 3307:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=topicdb -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -v mysql-db:/var/lib/mysql -d mysql:5.6
TO start stop:qpped container docker start mysql-standalone

To run docker using docker go to project base directory and build docker image `docke``r build -t topic-manager-docker .` 
Run the docker image : docker run -p 8086:8086 topic-manager-docker

Docker commands : 
to see the docker running processes :  docker container ls
to stop docker container : docker stop CONTAINER_ID