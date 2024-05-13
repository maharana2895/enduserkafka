package com.endUser.endUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 bin/zookeeper-server-start.sh config/zookeeper.properties
 
 bin/kafka-server-start.sh config/server.properties
 
 bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test
 
 bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic location-update-topic  --from-beginning
	
 bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning
	
 bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test
 
 
 */

@SpringBootApplication
public class EndUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EndUserApplication.class, args);
	}

}
