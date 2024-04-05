package com.example.Spring_demo_mvc.repositories;

import com.example.Spring_demo_mvc.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentReposetory extends JpaRepository<Student,Integer> {

    public Student getStudentById(Integer id);


}
