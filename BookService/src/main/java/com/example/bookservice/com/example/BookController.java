package com.example.bookservice.com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/findBook/{bookId}")
   public Book setMyFirstBook(@PathVariable Long bookId){
        return bookService.findBookById(bookId);

    }


    @GetMapping("/findAllBooks")
    public List<Book> findAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/findBookByTitle/{title}")
    public List<Book> findBooksByPartialTitle(@PathVariable String title){
        return bookService.findBooksByPartialTitle(title);
    }


    @GetMapping("/findBookByAuthor/{authorName}")
    public List<Book> findBooksByAuthor(@PathVariable String authorName){
        return bookService.findAllBooksByAuthor(authorName);
    }
}
