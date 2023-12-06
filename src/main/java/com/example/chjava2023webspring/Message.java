package com.example.chjava2023webspring;

import org.springframework.data.mongodb.core.mapping.Document;


public record Message
 (String name,
 String  message,
 String id){}

