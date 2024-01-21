package com.pinaki.user.service.repsitories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinaki.user.service.entities.User;

public interface UserRepositories extends JpaRepository<User, String>  {

}
