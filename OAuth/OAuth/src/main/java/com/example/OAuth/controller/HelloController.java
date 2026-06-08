package com.example.OAuth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //can access without authentication
    @GetMapping("/public")
    public String login(){
        return "Authenticated";
    }
    //only authorized user can access
    @GetMapping("/private")
    public String log(){
        return "Authorization";
    }
}
