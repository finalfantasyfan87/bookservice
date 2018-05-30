import com.example.bookservice.com.example.Book;
import com.example.bookservice.com.example.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {Book.class, BookController.class})
public class BookserviceApplication {

    public static void main(String[] args) {

        SpringApplication.run(BookserviceApplication.class, args);
    }
}
