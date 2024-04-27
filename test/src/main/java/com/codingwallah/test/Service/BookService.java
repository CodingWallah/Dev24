package com.codingwallah.test.Service;

import java.util.Map;

import com.codingwallah.test.Model.Book;

public interface BookService {
    Map<Integer, Book> getBooks();
    Book getBookById(int id);
    Book saveBook(Book book);
    String deleteBook(int id);
    Book updatMyBook(int id, Book book);

}
