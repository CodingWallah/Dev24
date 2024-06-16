package com.example.security_demo.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="userinfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String password;
    private String roles;
}
