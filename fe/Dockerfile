FROM openjdk:8-jdk-alpine
# Environment Variable
ENV LOGIC_URL http://localhost:5000
ADD target/k8demo-spring-0.0.1-SNAPSHOT.jar /
EXPOSE 8080
CMD ["java", "-jar", "k8demo-spring-0.0.1-SNAPSHOT.jar", "--logic.url=${LOGIC_URL}"]
