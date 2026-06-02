package com.example.springboot.service;

import com.example.springboot.model.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    List<Student> students=new ArrayList<>();
    public StudentService() {
        students.add(new Student(1,"Loga","Java"));
        students.add(new Student(2,"Varshhni","SpringBoot"));
    }

    public List<Student> getAllStudent(){
        return students;
    }

    public Student getStudentByRollNumber(int rno){
        int index=0;
        boolean flag=false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRollNo()==rno){
                index=i;
                flag=true;
            }
        }
        if(!flag){
            return new Student(0,"","");
        }
        return students.get(index);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public String updateStudent(Student student){
        int index=0;
        boolean flag=false;
        for (int i=0;i<students.size();i++){
            if(students.get(i).getRollNo()==student.getRollNo()){
//                students.get(i).setName(student.getName());
//                students.get(i).setTech(student.getTech());
                index=i;
                flag=true;
                break;
            }
        }
        if(flag){
            students.set(index,student);
            return "Updated Successfully";
        }
        return "No such Data";
    }

    public String deleteStudent(int rno) {
        int index=0;
        boolean flag=false;
        for (int i=0;i<students.size();i++){
            if(students.get(i).getRollNo()==rno){
                index=i;
                flag=true;
                break;
            }
        }
        if(flag){
            students.remove(index);
            return "Deleted Successfully";
        }
        return "No such Data";
    }
}
