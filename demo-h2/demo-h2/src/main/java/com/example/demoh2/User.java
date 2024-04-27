package com.example.demoh2;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity(name="usertb")
@Data
@Table
public class User {

    @Id
    int id;

    @Column
    String name;

}
