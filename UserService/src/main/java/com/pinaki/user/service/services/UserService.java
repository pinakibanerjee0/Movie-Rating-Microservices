package com.pinaki.user.service.services;

import java.util.List;

import com.pinaki.user.service.entities.User;

public interface UserService {

	// Create
	User saveUser(User u);

	// Read
	User getUser(String uId);

	List<User> getAllUser();

	// Update
	User updateUserDetails(User u);

	// Delete
	String deleteUser(String uId);

}
