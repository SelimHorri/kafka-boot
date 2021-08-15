
FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
COPY . .
ADD target/kafka-producer-consumer-with-spring-boot.jar kafka-producer-consumer-with-spring-boot.jar
ENTRYPOINT ["java", "-jar", "kafka-producer-consumer-with-spring-boot.jar"]
