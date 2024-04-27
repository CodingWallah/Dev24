package com.codingwallah.test.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MyController {
    
    @GetMapping("path")
    public String getMethodName() {
        return "Get";
    }

    @PostMapping("path1")
    public String postMethodName() {
        
        return "post";
    }

    @PutMapping("path/{id}")
    public String putMethodName() {
       
        return "put";
    }
    
    @DeleteMapping("path/{id}")
    public String deleteMethodName() {
        return "delete";
    }
}
