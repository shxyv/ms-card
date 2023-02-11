# set jdk for container
FROM openjdk:11-slim as build

# maintainer information
MAINTAINER shxyv

# adding app jar file to the container
COPY build/libs/ms-card-0.0.1-SNAPSHOT.jar ms-card-0.0.1-SNAPSHOT.jar

# execute the app
ENTRYPOINT ["java","-jar","ms-card-0.0.1-SNAPSHOT.jar"]

