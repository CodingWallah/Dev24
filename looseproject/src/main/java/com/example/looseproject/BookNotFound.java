package com.example.looseproject;

public class BookNotFound extends RuntimeException{
    public BookNotFound(String string) {
        super(string);
    }

}
