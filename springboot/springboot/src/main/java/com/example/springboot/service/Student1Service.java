package com.example.springboot.service;

import com.example.springboot.Dto.Student1Dto;
import com.example.springboot.model.Student1;
import com.example.springboot.repository.Student1Repository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

    //Custom Query
    public List<Student1> getStudentsByGenderAndTech(String gender, String tech) {
        return student1Repository.findByGenderAndTech(gender,tech);
    }

    public Student1 getStudentsByNameAndTech(String name, String tech) {
        return student1Repository.findByNameAndTech(name,tech);
    }

    public List<Student1> getStudentsByTech(String tech){
        return student1Repository.findByTech(tech);
    }

    //Native Query
    public List<Student1> getStudentsByGenAndTech(String gender, String tech) {
        return student1Repository.findByGenAndTech(gender,tech);
    }

    public Student1 getStudentByName(String name) {
        return student1Repository.findByName(name);
    }


    //DTO
    public Student1Dto getAllStudentByRollNumber(int rn) {
        Student1 s=student1Repository.findById(rn).orElseThrow();
        return convertStudentToDto(s);
    }

    public Student1Dto convertStudentToDto(Student1 s){
        Student1Dto std=new Student1Dto();
        std.setRno(s.getRno());
        std.setName(s.getName());
        std.setGender(s.getGender());
        std.setTech(s.getTech());
        std.setEmail(s.getEmail());
        return std;
    }

    public Student1Dto addStudentUsingDto(@Valid Student1Dto s) {
        Student1 s1=student1Repository.save(convertDtoToStudent(s));
        return convertStudentToDto(s1);
    }

    public Student1 convertDtoToStudent(Student1Dto s){
        Student1 std1=new Student1();
        std1.setRno(s.getRno());
        std1.setName(s.getName());
        std1.setGender(s.getGender());
        std1.setTech(s.getTech());
        std1.setEmail(s.getEmail());
        return std1;
    }

    public Page<Student1> getAllStudents(int page, int size) {
        return student1Repository.findAll(PageRequest.of(page,size));
    }
}
