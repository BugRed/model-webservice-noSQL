package com.redbug.exemple.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.redbug.exemple.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	//query methods criados pelo spring
	List<Post> findByTitleContainingIgnoreCase(String text);

	//query method personalisado
	@Query("{ 'title': { $regex: ?0, $options: 'i'}}")
	List<Post> searchTitle(String text);
}


