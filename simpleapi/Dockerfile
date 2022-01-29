FROM maven:3.6.3 AS maven
LABEL MAINTAINER="luucasgregorio@gmail.com"

WORKDIR /usr/src/app
COPY . /usr/src/app

RUN mvn package

FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=simpleapi.jar

WORKDIR /opt/app

COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/

ENTRYPOINT ["java","-jar","simpleapi.jar"]