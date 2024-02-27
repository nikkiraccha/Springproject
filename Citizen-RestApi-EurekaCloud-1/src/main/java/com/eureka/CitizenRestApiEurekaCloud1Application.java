package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CitizenRestApiEurekaCloud1Application {

	public static void main(String[] args) {
		SpringApplication.run(CitizenRestApiEurekaCloud1Application.class, args);
	}

}
