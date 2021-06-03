FROM maven:3.6.3-ibmjava-8-alpine AS agentUserServiceBuild
ARG STAGE=dev
WORKDIR /usr/src/agentuserservice
COPY . .
RUN mvn package -P${STAGE} -DskipTests


FROM openjdk:8-jdk-alpine AS agentUserServiceRuntime
WORKDIR /app
COPY --from=agentUserServiceBuild /usr/src/agentuserservice/target/agentUserService.jar ./
EXPOSE 8080
CMD java -jar agentUserService.jar