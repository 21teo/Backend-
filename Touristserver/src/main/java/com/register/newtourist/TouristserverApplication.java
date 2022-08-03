package com.register.newtourist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TouristserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristserverApplication.class, args);
	}

}
