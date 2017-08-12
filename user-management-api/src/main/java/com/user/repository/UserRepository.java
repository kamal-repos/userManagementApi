package com.user.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

	public User findByFirstName(String firstName);

	public List<User> findByLastName(String lastName);

}
