package pl.coderslab.app.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.book.Book;
import pl.coderslab.app.book.BookDao;
import pl.coderslab.app.publisher.Publisher;
import pl.coderslab.app.publisher.PublisherDao;

import java.util.List;

//@Controller
//@RequestMapping("/books")
//public class BookController {
//    @Autowired
//    private BookDao bookDao;
//    @Autowired
//    private PublisherDao publisherDao;
//
//
//    @GetMapping("/create")
//    @ResponseBody
//    public String create() {
//        Book book = new Book();
//        book.setAuthor("Bruce Eckel");
//        book.setTitle("Thinking in Java");
//
//        Publisher publisher = new Publisher();
//        publisher.setName("Wydawca 1");
//        book.setPublisher(publisher);
//
//        publisherDao.savePublisher(publisher);
//        bookDao.create(book);
//        return "Dodano książkę";
//    }
//
//    @GetMapping("/read/{id}")
//    @ResponseBody
//    public String read(@PathVariable Long id) {
//        Book book = bookDao.read(id);
//        if (book == null) {
//            return "Brak danych";
//        }
//        return book.toString();
//    }
//    @GetMapping("/update/{id}")
//    @ResponseBody
//    public String update(@PathVariable Long id) {
//        Book book = bookDao.read(id);
//        if (book == null) {
//            return "Brak danych";
//        }
//        book.setTitle("Thinking in Java 2");
//        bookDao.update(book);
//        return "Ksiazka zmodyfikowana";
//    }
//
//    @GetMapping("/delete/{id}")
//    @ResponseBody
//    public String delete(@PathVariable Long id) {
//        bookDao.delete(id);
//        return "Ksiazka usunieta";
//    }
//    @GetMapping
//    @ResponseBody
//    public String list() {
//        List<Book> books = bookDao.findAll();
//        return books.toString();
//    }
//}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.author.Author;
import pl.coderslab.app.author.AuthorService;
import pl.coderslab.app.publisher.Publisher;
import pl.coderslab.app.publisher.PublisherService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private PublisherService publisherService;

    @Autowired
    private AuthorService authorService;

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("book", new Book());
        return "book";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute @Valid Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "book";
        }
        bookService.saveBook(book);
        return "redirect:list";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Book> books = bookService.findAll();
        model.addAttribute("books", books);
        return "bookList";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        bookService.delete(id);
        return "redirect:../list";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable Long id, Model model) {
        Book book = bookService.readWithAuthors(id);
        model.addAttribute("book", book);
        return "book";
    }

    @PostMapping("/update/{id}")
    public String update(@ModelAttribute Book book) {
        bookService.update(book);
        return "redirect:../list";
    }

    @ModelAttribute("publishers")
    public List<Publisher> getPublishers() {
        return publisherService.findAll();
    }

    @ModelAttribute("authors")
    public List<Author> getAuthors() {
        return authorService.findAll();
    }
}