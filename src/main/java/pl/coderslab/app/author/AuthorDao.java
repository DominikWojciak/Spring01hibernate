package pl.coderslab.app.author;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AuthorDao {

    @PersistenceContext
    private EntityManager entityManager;


    public void create(Author author) {
        entityManager.persist(author);
    }

    public Author read(Long id) {
        return entityManager.find(Author.class, id);
    }

    public void update(Author author) {
        entityManager.merge(author);
    }

    public void delete(Long id) {
        Author author = read(id);
        if (author != null) {
            entityManager.remove(author);
        }
    }

    public List<Author> findAll() {
        Query query = entityManager.createQuery("select a from Author a");
        return query.getResultList();
    }

}