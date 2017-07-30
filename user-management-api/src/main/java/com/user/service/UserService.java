package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.user.model.User;
import com.user.repository.UserRepository;

public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
