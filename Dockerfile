FROM openjdk:11
ADD build/libs/*.jar dockerapp.jar
ENTRYPOINT ["java", "-jar", "dockerapp.jar"]

