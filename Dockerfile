FROM eclipse-temurin:17
COPY target/jekins.jar jekinsdocker.jar
CMD ["java", "-jar", "jekinsdocker.jar"]