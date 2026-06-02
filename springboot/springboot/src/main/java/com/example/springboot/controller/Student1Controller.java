package com.example.springboot.controller;

import com.example.springboot.model.Student1;
import com.example.springboot.service.Student1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Student1Controller {

    @Autowired
    Student1Service student1Service;

    @GetMapping("/get")
    public List<Student1> getAllStudents(){
        return student1Service.getAllStudents();
    }

}
