package com.example.looseproject;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.User;


@Controller
public class MyControll {
    
    @GetMapping("path")
    public String getMethodName( Model model) {
        String name = "Shivam Sharma";
        model.addAttribute("msg",name);
        return "myPage";
    }

    @GetMapping("path1")
    public String getMethodName1() {
        return "index";
    }

    ArrayList<String> al = new ArrayList<>();
    @PostMapping("/path3")
    public String getRes( Model model) {
        al.add("Brooo");
        al.remove(0);
        
        model.addAttribute("list",al);
        return "myPage2";
    }

    @GetMapping("path2")
    public String getMethodName1( Model model) {
        al.add("shiv");
        al.add("sharma");
        al.add("sharma");
        al.add("sharma");

        model.addAttribute("list",al);
        User user = new User();
        user.setName("sachin");

        model.addAttribute("user", user);
        
        String name = "Shivam Sharma";
        model.addAttribute("msg",name);
        model.addAttribute("name",null);
        return "myPage";
    }

    @GetMapping("/userForm")
    public String showForm(Model model) {
       // model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/processForm")
    public String processForm(User user, Model model) {
        // Process the user object received from the form submission
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println("-----------------------------------");
        model.addAttribute("user",user);
        return "res";
    }
}
