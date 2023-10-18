package com.redbug.exemple.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.redbug.exemple.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}


