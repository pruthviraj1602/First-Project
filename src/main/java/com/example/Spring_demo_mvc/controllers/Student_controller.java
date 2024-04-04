package com.example.Spring_demo_mvc.controllers;

import com.example.Spring_demo_mvc.entities.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/get")
public class Student_controller {

    @GetMapping("/test")
    public ResponseEntity<?> testAPI(){
        return ResponseEntity.ok("Hello World");
    }

   @GetMapping("/he")
     public String hemo(){
        return "Sweet Home";
     }
   @GetMapping("/student")
     public Student Student_info(){
        Student st=new Student();
        st.setId(1);
        st.setName("Pruthvi");
        st.setAddress("Thergaon");
        st.setEmail("pruthvi12@mail.com");
        st.setPassword("1234");
        return st;
     }

@GetMapping("/no")
     public ResponseEntity<Student> student_get(){
        Student std=new Student();
         std.setId(1);
         std.setName("Pruthvi");
         std.setAddress("Thergaon");
         std.setEmail("pruthvi12@mail.com");
         std.setPassword("1234");
         return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(std);
     }

     @PostMapping("/post")
     public ResponseEntity<Student> hello(@RequestBody Student st){

        Student std=new Student();
         std.setId(st.getId());
         std.setName(st.getName());
         std.setAddress(st.getAddress());
         std.setEmail(st.getEmail());
         std.setPassword(st.getPassword());
         return ResponseEntity.status(HttpStatus.CREATED).body(std);
     }


}

