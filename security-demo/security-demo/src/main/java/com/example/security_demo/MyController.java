package com.example.security_demo;

import com.example.security_demo.model.AuthRequest;
import com.example.security_demo.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    JwtService jwtService;
    @GetMapping("/home")
    public String home(){
        return "<h1>Welcome to the Spring Security Demo Home Page !!</h1>";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to the Spring Security Demo App !!";
    }

    @GetMapping("/user")
   @PreAuthorize("hasAuthority('ROLE_USER')")
    public String userService(){
        return "Hi, User !!";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String adminService(){
        return "Hi, Admin !!";
    }

    @PostMapping("/authenticate")
    public  String getTokenbyAuth(@RequestBody AuthRequest authRequest){
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            authRequest.getUsername(),
                            authRequest.getPassword())
            );

            if(authentication.isAuthenticated()) {
                return jwtService.generateToken(authRequest.getUsername());
            }
            else{
                throw new UsernameNotFoundException("Invalid User/ Credentials, please check again !!");
            }
    }
}














