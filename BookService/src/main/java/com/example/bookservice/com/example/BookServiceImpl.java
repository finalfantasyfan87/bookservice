package com.example.bookservice.com.example;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service("bookService")
public class BookServiceImpl implements BookService {


    @Override
    public List<Book> findAllBooks() {
        List<Book> listofBooks = new ArrayList<>();
        listofBooks.add(new Book(1L, "A Book Of Life"));
        listofBooks.add(new Book(2L, "Friendly Life"));
        return listofBooks;
    }

    @Override
    public Book findBookById(Long id) {

        return findAllBooks().stream()
                .filter(book -> book.getId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<Book> findBooksByPartialTitle(String title) {

        return findAllBooks().stream()
                .filter(books -> books.getName()
                .contains(title.toLowerCase()))
                .collect(Collectors.toList());
    }


}
