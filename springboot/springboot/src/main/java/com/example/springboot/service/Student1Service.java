package com.example.springboot.service;

import com.example.springboot.model.Student1;
import com.example.springboot.repository.Student1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student1Service {

    @Autowired
    Student1Repository student1Repository;
    public List<Student1> getAllStudents() {
        return student1Repository.findAll();
    }
}
