package com.example.looseproject;

public class Contra implements GamingConsole{
    public String up(){
        return "Jump";
    }
    
    public String down(){
        return "Crouch";
    }

    public String left(){
        return "Left";
    }

    public String right(){
        return "Right";
    }

}
