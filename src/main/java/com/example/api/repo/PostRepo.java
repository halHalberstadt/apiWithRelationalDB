package com.example.api.repo;

import com.example.api.obj.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface PostRepo
    extends MongoRepository<Post, Integer> {
        
}