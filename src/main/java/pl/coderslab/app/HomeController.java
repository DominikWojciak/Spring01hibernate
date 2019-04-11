package pl.coderslab.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.app.book.Book;
import pl.coderslab.app.book.BookRepository;

@Controller
public class HomeController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    @ResponseBody
    public String test() {
        Book book = bookRepository.findFirstByCategoryIdOrderByTitle(1l);
        return book.toString();
    }
}
