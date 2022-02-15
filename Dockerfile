FROM openjdk:11
EXPOSE 8081
ADD build/libs/*.jar dockerapp.jar
ENTRYPOINT ["java", "-jar", "dockerapp.jar"]

