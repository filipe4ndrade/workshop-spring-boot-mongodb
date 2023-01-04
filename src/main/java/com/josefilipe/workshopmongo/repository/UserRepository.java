package com.josefilipe.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.josefilipe.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
