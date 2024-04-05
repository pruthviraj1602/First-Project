package com.example.Spring_demo_mvc.controllers;

import com.example.Spring_demo_mvc.entities.Student;
import com.example.Spring_demo_mvc.services.IMPL.StudentServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.JstlUtils;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/get")
public class Student_controller {
    @Autowired
    private StudentServiceIMPL stuim;

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
     @GetMapping("/hell")
     public Student hello(){
        Student st=new Student();
        st.setId(2);
        st.setName("ramu");
        st.setAddress("varchi");
        st.setEmail("rahdv12@gmail.com");
        st.setPassword("123456");
        return st;
     }

     @PostMapping("/register")
     public Student registerStudent(@RequestBody Student Student){

        return stuim.registerStudent(Student);
 }

 @GetMapping("/getmap/{id}")
    public Student getStudent(@PathVariable Integer id ){
      return stuim.getStudentById(id);
 }
 @GetMapping("/getall")
    public List<Student> getAllStudent(){
        return stuim.getAllStudents();
 }

 @PutMapping("/updateStudent")
 public Student updateStudent(@RequestBody Student Student){
        return stuim.updateStudent(Student);
 }
 @DeleteMapping("/deleteStudent/{id}")
 public Boolean deleteStudent(@PathVariable Integer id){
        return stuim.deleteStudent(id);
 }


}

