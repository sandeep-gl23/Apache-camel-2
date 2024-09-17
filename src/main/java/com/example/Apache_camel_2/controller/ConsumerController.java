package com.example.Apache_camel_2.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @PostMapping("/api/consumer")
    public String receiveMessage(@RequestBody String message) {
        // Process the received message
        System.out.println("Received message: " + message);
        return "Message processed successfully";
    }
}
