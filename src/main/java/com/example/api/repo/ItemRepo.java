package com.example.api.repo;

import com.example.api.obj.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface ItemRepo
    extends MongoRepository<Item, Integer> {
        
}