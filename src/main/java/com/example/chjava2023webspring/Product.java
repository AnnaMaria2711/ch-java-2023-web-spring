package com.example.chjava2023webspring;


import org.springframework.data.mongodb.core.mapping.Document;

@Document("products") // muss heissen wie die Collection auf MongoDB

public record Product(
        String id,
        String name,
        int price

) {
}
