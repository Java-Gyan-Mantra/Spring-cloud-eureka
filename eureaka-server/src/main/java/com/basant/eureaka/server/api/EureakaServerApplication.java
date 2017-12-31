package com.basant.eureaka.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EureakaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EureakaServerApplication.class, args);
	}
}
