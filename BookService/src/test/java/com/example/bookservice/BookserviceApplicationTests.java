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
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


/*
Using this project build a rest service for a library. It should return
•	list of all books,
•	list of books by Author
•	list of books by partial Title match string search?
•	Add a book to the list

*/

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
        Assert.assertEquals(2, allBooks.size());

    }

    @Test
    public void testFindByBookById(){
        Book oneBook=  bookService.findBookById(1L);
        Assert.assertEquals(1L,oneBook.getId().longValue());
    }

    @Test
    public void testfindBookByPartialTitleNonExistent(){
        List<Book> books = bookService.findBooksByPartialTitle("uyf");
        Assert.assertEquals(0,books.size());
    }

    @Test
    public void testfindBookByPartialTitle(){
        List<Book> books = bookService.findBooksByPartialTitle("f");
        Assert.assertEquals("A Book Of Life",books.get(0).getName());
        Assert.assertEquals("Friendly Life",books.get(1).getName());

    }

}
