package com.example.demoh2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demoh2.exception.MyCustomException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class NewController {
    
    @GetMapping("exTesting")
    public String getMethodName1() {
        System.out.println(1);
        // try{
           System.out.println(2/0);
        // }catch (Exception e) {
        //     System.out.println(e);
        // }
        System.out.println(3);
        return "Exception Testing";
    }
    @GetMapping("exTesting2")
    public String getMethodName2() {
           String str = null;
            int len = str.length();
            System.out.println(len);
        return "Exception Testing 2";
    }

    @GetMapping("exTesting3")
    public String getMethodName3(@RequestParam Integer id) {
           if(id!=2)
             throw new MyCustomException(" bhai apki id exist nahi krti");

        return "Exception Testing 3";
    }
    
}
