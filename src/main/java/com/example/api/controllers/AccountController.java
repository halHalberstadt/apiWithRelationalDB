package com.example.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.api.obj.Account;
import com.example.api.repo.AccountRepo;

public class AccountController {

    @Autowired
    private AccountRepo repo;

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @GetMapping(value = "/login")
    public boolean login(@RequestBody String body) {
        return false;
    }

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @GetMapping(value = "/signup")
    public boolean signup(@RequestBody Account acct) {
        return false;
    }

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @GetMapping(value = "/getAllAccounts")
    public List<Account> getAllAccounts() {
        return repo.findAll();
    }

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @PostMapping(value = "/createAccount")
    public boolean createAccount(@RequestBody Account newAccount) {
        Account account = repo.findByUsername(newAccount.getUsername());
        if(account != null){
            return false;
        }
        repo.save(account);
        return true;
    }

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @GetMapping(value = "/getAccount")
    public Account getAccount(@RequestAttribute int id) {
        Account account = repo.findById(id).orElse(null);
        if(account == null){
            return null;
        }
        return account;
    }

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @PutMapping(value = "/updateAccount")
    public Account updateAccount(@RequestBody Account account) {
        Account foundAccount = repo.findById(account.getId()).orElse(null);
        if(foundAccount == null){
            return null;
        }
        repo.save(account);
        return account;
    }

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @DeleteMapping(value = "/deleteAccount")
    public boolean deleteAccount(@RequestAttribute int id) {
        Account account = repo.findById(id).orElse(null);
        if(account == null){
            return false;
        }
        repo.delete(account);
        return true;
    }
}
