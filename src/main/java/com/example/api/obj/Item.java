package com.example.api.obj;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Item")
public class Item {
    
    @Id private int id;
    
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

}
