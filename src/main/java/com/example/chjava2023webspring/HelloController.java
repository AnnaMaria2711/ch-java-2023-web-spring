package com.example.chjava2023webspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



    @RestController
    public class HelloController {
        @GetMapping("/hello/{name}")
        public String greetName(@PathVariable String name) {
            return "Hello, World!" + name;
        }

        @GetMapping("/hello")
        public String greet() {
            return "Hello, World!";
        }

    }
