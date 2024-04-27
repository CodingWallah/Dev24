package com.codingwallah.test.Service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.codingwallah.test.Model.Book;

@Service
public class BookServiceImpl implements BookService{

    private Map<Integer, Book> booksMap = new HashMap<>();
    private int bookId = 0;


    @Override
    public Map<Integer, Book> getBooks() {
            return booksMap;
        }

    @Override
    public Book getBookById(int id) {
        return booksMap.get(id);
        //handle the edge case if book is not found
     }

    @Override
    public Book saveBook(Book book) {
        book.setId(generatNextId());
        booksMap.put(book.getId(), book);
        return book;
     }

    @Override
    public String deleteBook(int id) {
        if(booksMap.get(id)==null) return "Book Not Found";
             
        booksMap.remove(id);
        return "delete succesfully";
      }

    @Override
    public Book updatMyBook(int id, Book updateBook) {
        Book existingBook = booksMap.get(id);
        existingBook.setTitle(updateBook.getTitle());
        existingBook.setAuthor(updateBook.getAuthor());

        return existingBook;
      }
    
      
     private int generatNextId(){
        return bookId++;
 }
}
