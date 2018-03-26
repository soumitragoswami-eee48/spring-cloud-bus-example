package com.cloud.bus.example.cloudbusdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;

@SpringBootApplication
@RemoteApplicationEventScan  // tells spring cloud bus to scan for custom events in the current package and subpackages
public class CloudbusdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudbusdemoApplication.class, args);
	}
}
