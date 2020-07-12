1. docker command to pull mysql
docker pull mysql
docker run -p 3307:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=topicdb -e MYSQL_USER=sa -e MYSQL_PASSWORD=password -d mysql:5.6
