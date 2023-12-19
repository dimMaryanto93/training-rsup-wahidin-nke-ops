FROM eclipse-temurin:17-alpine
COPY target/demo-applikasi-rsup-0.0.1-SNAPSHOT.jar spring-boot.jar
CMD java -jar spring-boot.jar
EXPOSE 8080/tcp