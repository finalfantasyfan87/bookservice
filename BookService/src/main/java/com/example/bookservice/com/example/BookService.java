package com.example.bookservice.com.example;

import java.util.List;


public interface BookService {

    Book findBookById(Long id);
    List<Book> findBooksByPartialTitle(String title);
    List<Book> findAllBooks();
    List<Book> findAllBooksByAuthor(String authorName);
    List<Book> addBook(Book book);


}
