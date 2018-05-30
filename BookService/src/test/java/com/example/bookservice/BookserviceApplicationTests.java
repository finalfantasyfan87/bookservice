package com.example.bookservice;

import com.example.bookservice.com.example.Book;
import com.example.bookservice.com.example.BookService;
import com.example.bookservice.com.example.BookServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {BookService.class, BookServiceImpl.class, Book.class})
public class BookserviceApplicationTests {

    @Autowired
    BookService bookService;

    @Test
    public void contextLoads() {
    }


    @Test
    public void testFindAllBooks(){
        List<Book> allBooks = bookService.findAllBooks();

    }

    @Test
    public void testFindByBookById(){
      Book oneBook=  bookService.findBookById(1L);
        Assert.assertEquals("A Book Of Life",oneBook.getName());
    }

}
