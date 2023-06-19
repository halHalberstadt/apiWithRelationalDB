package com.example.api.repo;

import com.example.api.obj.Account;
import org.springframework.data.mongodb.repository.MongoRepository;
 
public interface AccountRepo
    extends MongoRepository<Account, Integer> {
        
        Account findByUsername(String username);
}