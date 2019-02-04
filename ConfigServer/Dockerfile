FROM openjdk:11.0-oracle
ADD ./target/MusicSystem-0.0.1-SNAPSHOT.jar /usr/src/MusicSystem-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","MusicSystem-0.0.1-SNAPSHOT.jar"]