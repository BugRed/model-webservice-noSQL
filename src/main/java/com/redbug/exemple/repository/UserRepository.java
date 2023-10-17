package com.redbug.exemple.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.redbug.exemple.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
