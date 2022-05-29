package com.kasprzak.kamil.eureka.socialappeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SocialAppEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialAppEurekaApplication.class, args);
	}

}
