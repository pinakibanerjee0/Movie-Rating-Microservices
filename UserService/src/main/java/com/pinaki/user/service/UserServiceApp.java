package com.pinaki.user.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserServiceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to User Service App");
		SpringApplication.run(UserServiceApp.class, args);
	}

}
