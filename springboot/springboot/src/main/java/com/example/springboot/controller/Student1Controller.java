package com.example.springboot.controller;

import com.example.springboot.model.Student1;
import com.example.springboot.service.Student1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Student1Controller {

    @Autowired
    Student1Service student1Service;

    //getMapping
    @GetMapping("/get")
    public List<Student1> getAllStudents(){
        return student1Service.getAllStudents();
    }

    @GetMapping("/get/{rno}")
    public Student1 getStudentByRollNo(@PathVariable("rno") int rno){
        return student1Service.getStudentByRollNo(rno);
    }

    //postMapping
    @PostMapping("/add")
    public String addStudent(@RequestBody Student1 student1){
        return student1Service.addStudent(student1);
    }

    //putMapping
    @PutMapping("/update")
    public String updateStudent(@RequestBody Student1 student1){
        return student1Service.updateStudent(student1);
    }

    //deleteMapping
    @DeleteMapping("/delete")
    public String deleteAllStudents(){
        return student1Service.deleteAllStudents();
    }

    @DeleteMapping("/delete/{rno}")
    public String deleteStudent(@PathVariable("rno") int rno){
        return student1Service.deleteStudent(rno);
    }

    //Custom JPA Methods
    //get by gender and tech
    @GetMapping("get/custom")
    public List<Student1> getStudentsByGenderAndTech(@RequestParam("gender") String gender,
                                                     @RequestParam("tech") String tech){
        return student1Service.getStudentsByGenderAndTech(gender, tech);
    }

    //get by name and tech
    @GetMapping("get/custom1")
    public Student1 getStudentsByNameAndTech(@RequestParam("name") String name,
                                                     @RequestParam("tech") String tech){
        return student1Service.getStudentsByNameAndTech(name, tech);
    }

    //get by tech
    @GetMapping("get/tech/{tech}")
    public List<Student1> getStudentsByTech(@PathVariable("tech") String tech){
        return student1Service.getStudentsByTech(tech);
    }

    //Native Query
    @PostMapping("filter")
    public List<Student1> getStudentsByGenAndTech(@RequestParam("gender") String gender,
                                                  @RequestParam("tech") String tech){
        return student1Service.getStudentsByGenAndTech(gender,tech);
    }
}
