# Docker Example
This is a simple Spring Boot Application helping us run a Spring Boot Project inside `docker`.

## Assumption 
This assumes that you have a fair idea of what docker is and how containerization work. This
also expects you have `docker` cli installed, and it is fully functional. Having a Java runtime
is optional as it will be available inside the container.

## Compile and Generate Artifacts
To compile and generate artifacts to run.

```shell
./gradlew clean assemble
```
This command should generate the deployable runtime file inside `build/libs` folder.

## Build and Run the Docker Image

To build and run the image
```shell
docker-compose up -d
```
To recreate the aimages after making changes to code and building new artifacts
```shell
docker-compose up -d --build
```
This will create new image if the `jar` file needs to be updated.

## To shut down the docker image
Use the below command to bring down the running docker image.
```shell
docker-compose down
```

## TODO
 1. Need to add about this on my [blog](https://blog.vpv.io).
 2. Need to enable Debugging using IDE
 3. Add a DB Service to run inside the container
 4. Publish the image to docker hub and deploy to any cloud.