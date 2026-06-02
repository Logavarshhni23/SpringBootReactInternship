package com.example.FirstApi.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String greeting() {
        return "Hello SpringBoot!";
    }

    public String aboutme() {
        return "Springboot course";
    }

    public String lecture() {
        return "Course Lecture of SpringBoot";
    }
}
