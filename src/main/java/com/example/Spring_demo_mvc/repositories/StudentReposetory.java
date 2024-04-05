package com.example.Spring_demo_mvc.repositories;

import com.example.Spring_demo_mvc.entities.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface StudentReposetory extends JpaRepository<Student,Integer> {

    public Student getStudentById(Integer id);

    @Query(nativeQuery = true, value = "select * from student")
    public List<Student> getAllStudentList();


    @Query(nativeQuery = true,value = "select * from student where enable=true")
    public List<Student> getAllStudentsByEnable();

    public List<Student> getAllByEnable(Boolean b);

    @Transactional
     public Integer deleteStudentById(Integer id);


}
