package com.example.api.obj;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "USCard")
public class USCard {
    
    @Id private int id;
    private long cardNumber;
    private Date expiration;
    private int zipCode;
    private boolean isVerified;
    
    
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

}
