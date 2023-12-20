FROM openjdk:latest
LABEL authors="ASWIN"
EXPOSE 8080
ADD target/questions.jar questions.jar
ENTRYPOINT ["java","-jar","/questions.jar"]