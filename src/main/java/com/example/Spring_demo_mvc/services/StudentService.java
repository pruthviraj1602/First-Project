package com.example.Spring_demo_mvc.services;

import com.example.Spring_demo_mvc.entities.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public interface StudentService {

    public Student registerStudent(Student stud);
    public Student getStudentById(Integer id);
}