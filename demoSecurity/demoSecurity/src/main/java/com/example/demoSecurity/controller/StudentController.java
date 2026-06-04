package com.example.demoSecurity.controller;

import com.example.demoSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {
    List<Student>students=new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Loga","Java"),
                    new Student(2,"Varshhni","Java")
            )
    );

    @GetMapping("/stu/get")
    public List<Student> getAllStudent(){
        return students;
    }

    @PostMapping("/stu/add")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Student Added Successfully";
    }

    @PutMapping("/stu/update/{id}")
    public String updateStudent(@PathVariable int id,
                                @RequestBody Student updatedStudent) {

        for (Student student : students) {
            if (student.getRno() == id) {
                student.setName(updatedStudent.getName());
                student.setTech(updatedStudent.getTech());
                return "Student Updated Successfully";
            }
        }

        return "Student Not Found";
    }

    @GetMapping("csrf")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken)request.getAttribute("_csrf");
    }
}
