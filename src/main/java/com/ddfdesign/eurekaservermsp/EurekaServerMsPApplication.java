package com.ddfdesign.eurekaservermsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMsPApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaServerMsPApplication.class, args);
		System.out.println();
	}
}
