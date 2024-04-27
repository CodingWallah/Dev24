package com.example.demoh2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoh2.model.NewUser;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("new-user")
@Validated
public class NewUserController {
    
    @Autowired
    UserValidator userValidator;
    @PostMapping("/save")
    public ResponseEntity<?> save(@Valid @RequestBody NewUser user) {
        return ResponseEntity.ok().body(user);
    }

    @GetMapping("/get/{id}")
    public String getAll(@NotNull @PathVariable int id) {
        return "read successfully "+id;
    }

    // HW - to handle exception in global exception handler
    @DeleteMapping
    public String del(){
        return "delete";
    }
}
