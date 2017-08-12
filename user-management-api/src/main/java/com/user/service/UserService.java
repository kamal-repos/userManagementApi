package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserById(Integer id) {
		return userRepository.findOne(id);
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public void deleteUser(Integer id) {
		userRepository.delete(id);
	}

}
