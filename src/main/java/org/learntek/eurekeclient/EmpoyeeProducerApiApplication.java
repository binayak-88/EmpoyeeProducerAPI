package org.learntek.eurekeclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmpoyeeProducerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpoyeeProducerApiApplication.class, args);
	}

}
