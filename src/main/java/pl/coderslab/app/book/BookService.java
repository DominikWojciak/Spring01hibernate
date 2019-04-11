package pl.coderslab.app.book;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookService {
    @Autowired
    private BookRepository bookRepository;    public void saveBook(Book book) {
        bookRepository.save(book);
    }    public Book read(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
    public Book readWithAuthors(Long id){
        Book book = read(id);
        Hibernate.initialize(book.getAuthors());
        return book;
    }    public void update(Book book) {        bookRepository.save(book);
    }    public void delete(Long id) {
        bookRepository.deleteById(id);
    }    public List<Book> findAll() {
        return bookRepository.findAll();
    }
    public List<Book> findAllPropositions() {
        return bookRepository.findByProposition(true);
    }
}