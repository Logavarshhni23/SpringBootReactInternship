package com.example.springboot.repository;

import com.example.springboot.model.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Student1Repository extends JpaRepository<Student1,Integer> {
    List<Student1> findByGenderAndTech(String gender, String tech);
    Student1 findByNameAndTech(String name, String tech);
}
