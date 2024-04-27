package com.example.testingdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    
    @GetMapping
    public int add(@RequestParam int a,@RequestParam int b){
            return a+b-1;
    }

    @GetMapping
    public int mul(@RequestParam int a,@RequestParam int b){
            return a*b;
    }

    @GetMapping
    public  String findBookByID(int id){
        return "Java Book";
    }
}
