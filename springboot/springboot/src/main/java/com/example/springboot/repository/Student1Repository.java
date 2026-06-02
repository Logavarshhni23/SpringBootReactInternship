package com.example.springboot.repository;

import com.example.springboot.model.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Student1Repository extends JpaRepository<Student1,Integer> {
    List<Student1> findByGenderAndTech(String gender, String tech);
    Student1 findByNameAndTech(String name, String tech);
    List<Student1> findByTech(String tech);

    //Native Query
    @Query(nativeQuery = true,value="SELECT * FROM Student1 where gender=:gender AND tech=:tech")
    //gender in table and value of gender
    List<Student1> findByGenAndTech(@Param("gender") String gender,@Param("tech") String tech);
}
