package com.example.FirstApi.controller;

import com.example.FirstApi.component.Student;
import com.example.FirstApi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Student create(@RequestBody Student student) {
        return studentService.createStudent();
    }

    //@GetMapping("get")
}
