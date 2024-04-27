package com.example.demoh2;

public class Ruff {
    public static void main(String[] args) {
        
        System.out.println(1/1);
        System.out.println(2/1);
        System.out.println(3/1);
        
        try {
            System.out.println(4/0);
        } catch (Exception e) {
            System.out.println(e);
        }
       
        
        System.out.println(5/1);
        System.out.println(6/1);
    }
}
