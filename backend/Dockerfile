FROM gradle:8.5.0-jdk21 AS builder
WORKDIR /
COPY . ./
RUN gradle assemble --no-daemon

FROM openjdk:21-jdk
COPY --from=builder build/libs/webtech-db-demos-0.0.1-SNAPSHOT.jar .

ARG SPRING_PROFILES=docker
ENV env_spring_profiles=$SPRING_PROFILES

ENTRYPOINT ["java", "-Dspring.profiles.active=${env_spring_profiles}", "-jar","/webtech-db-demos-0.0.1-SNAPSHOT.jar"]
