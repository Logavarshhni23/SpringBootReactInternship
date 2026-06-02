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

    public String addStudent(Student1 student1) {
        student1Repository.save(student1);
        return "Added Successfully";
    }

    public Student1 getStudentByRollNo(int rno) {
        return student1Repository.findById(rno).orElse(new Student1());
    }

    public String updateStudent(Student1 student1) {
        student1Repository.save(student1);
        return "Updated Successfully";
    }


    public String deleteStudent(int rno) {
        student1Repository.deleteById(rno);
        return "Deleted Successfully";
    }

    public String deleteAllStudents() {
        student1Repository.deleteAll();
        return "Deleted All Students Successfully";
    }

    public List<Student1> getStudentsByGenderAndTech(String gender, String tech) {
        return student1Repository.findByGenderAndTech(gender,tech);
    }

    public Student1 getStudentsByNameAndTech(String name, String tech) {
        return student1Repository.findByNameAndTech(name,tech);
    }
}
