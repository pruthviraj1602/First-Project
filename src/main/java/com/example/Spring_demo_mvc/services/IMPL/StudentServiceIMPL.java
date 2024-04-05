package com.example.Spring_demo_mvc.services.IMPL;

import com.example.Spring_demo_mvc.entities.Student;
import com.example.Spring_demo_mvc.repositories.StudentReposetory;
import com.example.Spring_demo_mvc.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceIMPL implements StudentService {
    @Autowired
    private StudentReposetory sture;
    @Override
    public Student registerStudent(Student stud) {
      stud.setEnable(false);
        return sture.save(stud);
    }

    @Override
    public Student getStudentById(Integer id) {
        return sture.getStudentById(id);
    }
}
