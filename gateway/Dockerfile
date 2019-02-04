FROM openjdk:11.0-oracle
ADD ./target/gateway-0.0.1-SNAPSHOT.jar /usr/src/gateway-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","gateway-0.0.1-SNAPSHOT.jar"]