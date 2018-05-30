package com.example.bookservice.com.example;

import org.springframework.stereotype.Service;

import java.util.List;


public interface BookService {

    Book findBookById(Long id);
    List<Book> findAllBooks();
}
