package com.example.testingdemo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.testingdemo.controller.MyClass;

public class MyClassTests {
    
    @Test
    void addTest1(){
        int a = 2;
        int b=3;

        MyClass myClass = new MyClass();
        int res = myClass.add(a,b);

        assertEquals(5, res);
    }

    @Test
    void addTestMinus(){
        int a = -2;
        int b=-3;

        MyClass myClass = new MyClass();
        int res = myClass.add(a,b);

        assertEquals(-5, res);
    }

    @Test
    void addTest2(){
        int a = 2;
        int b=3;

        MyClass myClass = new MyClass();
        int res = myClass.mul(a,b);

        assertEquals(6, res);
    }

    @Test
    void findBookTest(){
        int id = 2;
        MyClass myClass = new MyClass();
        String res = myClass.findBookByID(id);
        Assertions.assertNotNull(res);


    }
}
