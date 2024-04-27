package com.example.demoh2;

import java.net.URI;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
    
    MyRepositry myRepositry;

    public MyController(MyRepositry myRepositry) {
        this.myRepositry = myRepositry;
    }


    @RequestMapping("c")
    private String create(){
        myRepositry.createTable();
        return "Create table";
    }

    @RequestMapping("/i")
    private String insert(){

        myRepositry.insertData("shivam");
        
        return "Insert into table";
    }

    @RequestMapping("g")
    private List<String> read(){
        return myRepositry.getAllNames();
    }
}