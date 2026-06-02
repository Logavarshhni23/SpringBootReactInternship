package com.example.springboot.controller;

import com.example.springboot.model.Student;
import com.example.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/students/{rno}")
    public Student getStudentByRollNumber(@PathVariable("rno") int rno){
        return studentService.getStudentByRollNumber(rno);
    }

    @PostMapping("/students")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "success";
    }

    @PutMapping("/students")
    public String updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("students/{rno}")
    public String deleteStudent(@PathVariable("rno") int rno){
        return studentService.deleteStudent(rno);
    }
}

