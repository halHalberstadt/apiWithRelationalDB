package com.example.api.repo;

import com.example.api.obj.Board;

import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface BoardRepo
    extends MongoRepository<Board, Integer> {
        
}
