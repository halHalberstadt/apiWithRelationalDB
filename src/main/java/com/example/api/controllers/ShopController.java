package com.example.api.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ShopController {

    public static final String FRONTEND_SHOP_URL = "https://capstone-frontend-plagarism.herokuapp.com/";

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @GetMapping(value = "/getTotal")
    public void getTotal(@RequestBody String body) {
    }

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @GetMapping(value = "/purchase")
    public void purchase(@RequestBody String body) {
    }

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @GetMapping(value = "/getItem")
    public void getItem(@RequestBody String body) {
    }

    @CrossOrigin(origins = {"http://localhost:3000/"})
    @GetMapping(value = "/getCart")
    public void getCart(@RequestBody String body) {
    }
}
