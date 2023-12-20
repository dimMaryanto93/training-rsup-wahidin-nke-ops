FROM eclipse-temurin:17-alpine
ARG JAR_FILE=demo-applikasi-rsup-0.0.1-SNAPSHOT.jar
COPY target/$JAR_FILE spring-boot.jar
CMD java -jar spring-boot.jar
EXPOSE 8080/tcp