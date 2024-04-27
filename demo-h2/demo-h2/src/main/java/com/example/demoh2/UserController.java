package com.example.demoh2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    MyReposotpryCrud myReposotpryCrud;

    public UserController(MyReposotpryCrud myReposotpryCrud){
        this.myReposotpryCrud = myReposotpryCrud;
    }

    @GetMapping
    public List<User> getAllUser(){
        System.out.println(myReposotpryCrud.findAll());
            return myReposotpryCrud.findAll();
    }

    @PostMapping
    String saveUser(@RequestBody User user){
        myReposotpryCrud.save(user);
        return "saved successfuly";
    }

    @DeleteMapping()
    String deleteUser(){
        User exu = myReposotpryCrud.findById(2).get();
            myReposotpryCrud.delete(exu);
        return "delete succesfully";
    }

    //update method
}
