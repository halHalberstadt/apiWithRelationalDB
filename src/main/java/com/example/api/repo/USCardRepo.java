package com.example.api.repo;

import com.example.api.obj.USCard;
import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface USCardRepo
    extends MongoRepository<USCard, Integer> {
        
}
