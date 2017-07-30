package com.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.user.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {

}
