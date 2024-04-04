package com.example.Spring_demo_mvc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adm")
public class AdminController {

    @GetMapping("/name")
    public String name(){
        return "Pruthviraj";
    }
}
