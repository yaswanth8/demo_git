package com.learning.spring.demo_git.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/getName")
    public String getName(){
        return "Sample end point";
    }

    @PostMapping("/create")
    public String createCustomer(String name){

        return name;
    }


}
