package com.codingwallah.test.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.codingwallah.test.Entity.BookEntity;
import com.codingwallah.test.Model.Book;
import com.codingwallah.test.Repository.BookRepository;

@Service
public class BookServiceimpl2 implements BookService2{

    BookRepository bookRepository;
    BookServiceimpl2(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }
    @Override
    public List<Book> getBooks() {
        //type conversion from entity to model;
        List<Book> books = new ArrayList<>();
       List<BookEntity> booksDB = bookRepository.findAll();
       //BeanUtils.copyProperties(booksDB, books);
       for (BookEntity bookEntity : booksDB) {
            Book book = new Book();
            BeanUtils.copyProperties(bookEntity, book);

            books.add(book);
       }
       return books;
    }

    @Override
    public Book getBookById(int id) {
       BookEntity bookEntity = bookRepository.findById(id).get();
       Book book = new Book();

       BeanUtils.copyProperties(bookEntity, book);
       return book;

    }

    @Override
    public Book saveBook(Book book) {
       BookEntity bookEntity = new BookEntity();
       BeanUtils.copyProperties(book, bookEntity);
        //please please check if user already exist then don't update 
       bookRepository.save(bookEntity);
       return book;
    }

    @Override
    public String deleteBook(int id) {
        BookEntity bookEntity = bookRepository.findById(id).get();
        bookRepository.delete(bookEntity);
        return "delete succesfully";
    }

    @Override
    public Book updatMyBook(int id, Book book) {
        //check is exist
        BookEntity bookEntity = bookRepository.findById(id).get();
        
        //update the privous values in entity
        bookEntity.setAuthor(book.getAuthor());
        bookEntity.setTitle(book.getTitle());

        //update into database
        bookRepository.save(bookEntity);

        return book;
    }
    
}
