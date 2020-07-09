1. docker command to pull mysql
docker pull mysql
docker run --name mysql-standalone -e MYSQL_ROOT_PASSWORD=dhiraj1212 -e MYSQL_DATABASE=topicdb -e MYSQL_PASSWORD=dhiraj1212 -d mysql:latest
