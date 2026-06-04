package com.example.demoSecurity.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String greet(){
        return "Hello Guys!!!";
    }
    @GetMapping("/")
    public String home(HttpServletRequest request){
        return "Home Page"+" "+request.getSession().getId();
    }
}
