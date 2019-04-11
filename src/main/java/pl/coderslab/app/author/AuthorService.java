package pl.coderslab.app.author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AuthorService {

    @Autowired
    private AuthorDao authorDao;

    public void create(Author author) {
        authorDao.create(author);
    }

    public Author read(Long id) {
        return authorDao.read(id);
    }

    public void update(Author author) {
        authorDao.update(author);
    }

    public void delete(Long id) {
        authorDao.delete(id);
    }

    public List<Author> findAll() {
        return authorDao.findAll();
    }
}