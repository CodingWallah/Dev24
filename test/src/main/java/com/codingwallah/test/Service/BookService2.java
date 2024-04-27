package com.codingwallah.test.Service;

import java.util.List;


import com.codingwallah.test.Model.Book;

public interface BookService2 {
    List<Book> getBooks();
    Book getBookById(int id);
    Book saveBook(Book book);
    String deleteBook(int id);
    Book updatMyBook(int id, Book book);

}
