FROM adoptopenjdk:11-jdk
EXPOSE 8080
ADD build/libs/docker-example.jar /app/
WORKDIR /app
CMD java -jar docker-example.jar
