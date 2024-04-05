package com.example.Spring_demo_mvc.services.IMPL;

import com.example.Spring_demo_mvc.entities.Student;
import com.example.Spring_demo_mvc.repositories.StudentReposetory;
import com.example.Spring_demo_mvc.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Student> getAllStudents() {
        return sture.getAllByEnable(false);
    }

    @Override
    public Student updateStudent(Student stud) {

        return sture.save(stud);
    }

    @Override
    public Boolean deleteStudent(Integer id) {
        Integer i = sture.deleteStudentById(id);
        System.out.println("delete Value "+i);
        if(i==0){
            return false;
        }else {
            return true;
        }
    }


}
