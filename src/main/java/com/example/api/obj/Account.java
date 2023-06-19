package com.example.api.obj;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Account")
public class Account {

    @Id private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private ArrayList<Post> posts;
    private ArrayList<Cart> carts;


}
