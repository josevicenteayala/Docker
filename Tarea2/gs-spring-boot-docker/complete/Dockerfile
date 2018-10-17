FROM openjdk:8-jdk-alpine
COPY ./target/taller2-spring-boot-docker-0.1.0.jar /opt/lib/app.jar
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/lib/app.jar"]
EXPOSE 8080