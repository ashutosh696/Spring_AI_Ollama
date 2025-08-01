package com.ashu.springai.controller;


import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ai")
public class OllamaController {
    @Autowired
   OllamaChatClient chatClient;



    @GetMapping
    public String ask(@RequestParam String message) {
        System.out.println("AI:  "+message);
        String response = chatClient.call(message);
        System.out.println("response:  "+response);
        return response;

    }

}
