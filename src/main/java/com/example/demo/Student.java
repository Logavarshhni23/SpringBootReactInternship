package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public void study(){
        System.out.println("I am doing Engineering");
    }
    public Student(){
        System.out.println("Student Object Created");
    }
}
