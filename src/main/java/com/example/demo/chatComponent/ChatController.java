package com.example.demo.chatComponent;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

	@CrossOrigin(origins = "*", allowedHeaders = "Content-Type")
    @PostMapping("/api/chat")
    public String processData(@RequestBody String data) {
        // Process the data received from the POST request
    	
        return "Received data: " + data;
    }
}
