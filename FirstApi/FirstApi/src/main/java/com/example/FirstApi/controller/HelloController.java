package com.example.FirstApi.controller;

import com.example.FirstApi.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @GetMapping("/")
    public String greet(){
        return helloService.greeting();
    }

    @GetMapping("/about")
    public String about(){
        return helloService.aboutme();
    }

    @GetMapping("/about/lecture")
    public String lecture(){
        return helloService.lecture();
    }

}
