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
        Author author1 = new Author(1L, "JOHN LEE");
        Author author2 = new Author(2L, "JASMINE YOUNG");
        listofBooks.add(new Book(1L, "A BOOK OF LIFE",author1));
        listofBooks.add(new Book(2L, "FRIENDLY ADVICE", author2));
        return listofBooks;
    }

    @Override
    public List<Book> findAllBooksByAuthor(String authorName) {
        return findAllBooks().stream().filter(book -> book
                .getAuthor().getName().contains(authorName.toUpperCase()))
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
                .contains(title.toUpperCase()))
                .collect(Collectors.toList());
    }


}
