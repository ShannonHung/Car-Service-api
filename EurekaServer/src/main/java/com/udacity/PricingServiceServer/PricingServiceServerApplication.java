package com.udacity.PricingServiceServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PricingServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PricingServiceServerApplication.class, args);
	}

}
