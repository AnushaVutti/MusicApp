FROM openjdk:11.0-oracle
ADD ./target/SpringEurekaServer-0.0.1-SNAPSHOT.jar /usr/src/SpringEurekaServer-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","SpringEurekaServer-0.0.1-SNAPSHOT.jar"]