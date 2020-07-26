FROM openjdk

ARG JAR_FILE=/target/DevOps_Demo-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

MAINTAINER "rahulkalithkar1996@gmail.com"

ENTRYPOINT ["java","-jar","app.jar"]
