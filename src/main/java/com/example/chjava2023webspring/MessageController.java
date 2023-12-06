package com.example.chjava2023webspring;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessageController {


    List<Message> messagesList = new ArrayList<>();

    @PostMapping("/message")
    public Message postMessage(@RequestBody Message message) {
        messagesList.add(message);
        return message;
    }

    @GetMapping("/message")
    public List<Message> getMessage() {
        return messagesList;
    }

    @DeleteMapping("/message/{id}")
    public Message deleteId(@PathVariable String id) {
        for( Message message : messagesList ){
            if (message.id().equals(id)){
                messagesList.remove(message);
                return  message;
            }
        }
        throw new RuntimeException("Message with ID does not exist.");
    }
}
