package com.example.Spring_demo_mvc.services;

import com.example.Spring_demo_mvc.entities.Student;

import java.util.List;


public interface StudentService {

    public Student registerStudent(Student stud);
    public Student getStudentById(Integer id);

    public List<Student> getAllStudents();

    public Student updateStudent(Student stud);

    public Boolean deleteStudent(Integer id);
}