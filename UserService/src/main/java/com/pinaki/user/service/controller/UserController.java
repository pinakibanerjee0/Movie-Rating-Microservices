package com.pinaki.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pinaki.user.service.entities.User;
import com.pinaki.user.service.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User u){
		return new ResponseEntity<>(service.saveUser(u), HttpStatus.OK);		
	}
	
	@GetMapping("/{uId}")
	public  ResponseEntity<User> getUser(@PathVariable String uId){
		return new ResponseEntity<>(service.getUser(uId),HttpStatus.OK);
	}
	@GetMapping("/getUserList")
	public  ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<>(service.getAllUser(),HttpStatus.OK);

	}

}
