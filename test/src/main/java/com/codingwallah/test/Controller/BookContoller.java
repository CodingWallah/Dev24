package com.codingwallah.test.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.codingwallah.test.Model.Book;
import com.codingwallah.test.Service.BookService;
import com.codingwallah.test.Service.BookServiceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController  // call receive from the client | call forward to service - > response
@RequestMapping("books")
public class BookContoller {

    //object creataion - jvm & programmer
    //BookService bookService = new BookServiceImpl();

    //object creation - by spring ioc | di - autowiring
    @Autowired
    BookService bookService;


    @GetMapping
     public Map getAllBooks() {
         return bookService.getBooks();  //call forwarding
     }

     @GetMapping("/{id}")
     public Book readBookById(@PathVariable int id) {
         return bookService.getBookById(id);
     }

     @PostMapping
     public Book createBook(@RequestBody Book book) {
         return bookService.saveBook(book);
     }

     @PutMapping("/{id}")
     public Book updateBook(@PathVariable int id, @RequestBody Book updateBook) {
        return bookService.updatMyBook(id, updateBook);
     }

     @DeleteMapping("/{id}")
     public String deleteBook(@PathVariable int id) {
       return bookService.deleteBook(id);
    }

    @GetMapping("/mul")
    public Integer mul(@RequestParam Integer a, @RequestParam Integer b){
        return a*b;
    }
}
