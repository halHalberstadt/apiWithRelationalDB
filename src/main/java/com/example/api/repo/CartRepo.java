package com.example.api.repo;

import com.example.api.obj.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface CartRepo
    extends MongoRepository<Cart, Integer> {
        
}