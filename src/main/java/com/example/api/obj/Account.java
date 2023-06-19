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

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstname){
        this.firstName = firstname;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastname){
        this.lastName = lastname;
    }

    public ArrayList<Post> getPosts(){
        return this.posts;
    }

    public void addPost(Post post){
        this.posts.add(post);
    }

    public void setPosts(ArrayList<Post> posts){
        this.posts = posts;
    }

    public ArrayList<Cart> getCarts(){
        return this.carts;
    }

    public void addCart(Cart cart){
        this.carts.add(cart);
    }

    public void setCarts(ArrayList<Cart> carts){
        this.carts = carts;
    }

}
