package com.example.demoh2.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class NewUser {

    @NotNull
    String userName;
    
    @NotBlank
    @Size(min = 4, message = "password must be greater of 4")
    String psw;

    @Email
    String Email;

    @Min(18)
    @Max(50)
    int age;
}
