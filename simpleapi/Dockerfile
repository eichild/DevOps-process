FROM adoptopenjdk/openjdk11:alpine-jre

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDITIONAL_OPTS}

WORKDIR /opt/orangeBank

COPY /target/simpleapi*.jar simpleapi.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 5005
EXPOSE 8080

CMD java ${ADDITIONAL_OPTS} -jar simpleapi.jar --spring.profiles.active=${PROFILE}