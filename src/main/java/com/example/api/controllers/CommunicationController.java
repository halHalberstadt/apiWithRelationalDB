package com.example.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.api.obj.Post;

public class CommunicationController {

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @PostMapping(value = "/newPost")
    public void newPost(@RequestBody Post post) {
    }

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @GetMapping(value = "/getPost")
    public void getPost(@RequestBody int id) {

    }
}
