# KafkaBoot
## kafka-producer-consumer-with-spring-boot

Simple Spring Boot app to consume the published message into a Kafka topic through a simple Rest API:
/messages/publish/{msg}

<pre>
 _   __         __  _           ______                _   
| | / /        / _|| |          | ___ \              | |  
| |/ /   __ _ | |_ | | __  __ _ | |_/ /  ___    ___  | |_ 
|    \  / _` ||  _|| |/ / / _` || ___ \ / _ \  / _ \ | __|
| |\  \| (_| || |  |   < | (_| || |_/ /| (_) || (_) || |_ 
\_| \_/ \__,_||_|  |_|\_\ \__,_|\____/  \___/  \___/  \__|
Supersonic Java with Spring Boot ☕️💚
</pre>

### Kafka producer

- Launch Zookeeper server

```shell
  ${KAFKA_HOME}/bin/zookeeper-server-start.sh ./config/zookeeper.properties
```

- Launch Kafka server

```shell
  ${KAFKA_HOME}/bin/kafka-server-start.sh ./config/server.properties
```

- Create new Topic called 'NewTopic'

```shell
  ${KAFKA_HOME}/bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic NewTopic --from-beginning
```

### Kafka consumer (optional)

- Launch a consumer message streamer

```shell
  ${KAFKA_HOME}/bin/kafka-console-producer --broker-list localhost:9092 --topic NewTopic
```
