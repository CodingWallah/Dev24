package com.example.testingdemo.test;

import com.example.testingdemo.controller.MyClass;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTestClass {

    @BeforeAll
    static void ball(){
        System.out.println("Before all");
    }

    @AfterAll
    static void aall(){
        System.out.println("After all");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
    }


    @Test
    void addTest1(){
        int a = 2;
        int b=3;

        MyClass myClass = new MyClass();
        int res = myClass.add(a,b);

        assertEquals(5, res);
    }

    @Test
    void addTest2(){
        int a = 2;
        int b=3;

        MyClass myClass = new MyClass();
        int res = myClass.add(a,b);

        assertEquals(4, res);
    }
}
