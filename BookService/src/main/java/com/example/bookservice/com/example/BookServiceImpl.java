package com.example.bookservice.com.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("bookService")
public class BookServiceImpl  implements BookService{


    @Override
    public List<Book> findAllBooks() {
        List<Book> listofBooks = new ArrayList<>();
        listofBooks.add(new Book(1L, "A Book Of Life"));
        listofBooks.add(new Book(2L, "Friendly Life"));
        return listofBooks;
    }

    @Override
    public Book findBookById(Long id) {

        return findAllBooks().stream().filter(book -> book.getId() == id).findFirst().map(book -> book).orElse(null);
    }


}
