package com.josefilipe.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.josefilipe.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
