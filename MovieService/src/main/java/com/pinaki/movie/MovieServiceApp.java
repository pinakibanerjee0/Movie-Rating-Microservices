package com.pinaki.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MovieServiceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Movie Service App");
		SpringApplication.run(MovieServiceApp.class, args);
	
	}

}
