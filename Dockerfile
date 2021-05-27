FROM openjdk:8
EXPOSE 8080
ADD target/pcrs-vn.jar pcrs-vn.jar
ENTRYPOINT ["java","-jar","pcrs-vn.jar"]