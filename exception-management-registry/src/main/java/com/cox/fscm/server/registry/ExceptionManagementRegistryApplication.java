package com.cox.fscm.server.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ExceptionManagementRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionManagementRegistryApplication.class, args);
	}

}
