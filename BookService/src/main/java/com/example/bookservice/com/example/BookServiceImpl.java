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
        Author author1 = new Author(1L, "John Lee");
        Author author2 = new Author(2L, "Jasmine Young");
        listofBooks.add(new Book(1L, "A Book Of Life",author1));
        listofBooks.add(new Book(2L, "Friendly Life", author2));
        return listofBooks;
    }

    @Override
    public List<Book> findAllBooksByAuthor(String authorName) {
        return findAllBooks().stream().filter(book -> book
                .getAuthor().getName().equalsIgnoreCase(authorName))
                .collect(Collectors.toList());
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
                .contains(title))
                .collect(Collectors.toList());
    }


}
