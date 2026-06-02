package com.example.springboot.repository;

import com.example.springboot.model.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student1Repository extends JpaRepository<Student1,Integer> {
}
