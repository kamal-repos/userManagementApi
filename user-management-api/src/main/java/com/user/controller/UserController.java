package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@CrossOrigin(value = "http://localhost:4200")
	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@CrossOrigin(value = "http://localhost:4200")
	@RequestMapping(value = "/users/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUserById(@PathVariable("id") Integer id) {
		return userService.getUserById(id);
	}

	@CrossOrigin(value = "http://localhost:4200")
	@RequestMapping(value = "/users", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@CrossOrigin(value = "http://localhost:4200")
	@RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteUser(@PathVariable("id") Integer id) {
		userService.deleteUser(id);
	}

}
