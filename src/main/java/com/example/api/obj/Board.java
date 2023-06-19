package com.example.api.obj;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Board")
public class Board {
    
    @Id private int id;
    private ArrayList<Post> posts;
    public String BoardName;
    
}
