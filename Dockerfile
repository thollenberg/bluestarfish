FROM adoptopenjdk:11-jre-hotspot

WORKDIR /app

COPY target/integration-fabric-1.0-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]