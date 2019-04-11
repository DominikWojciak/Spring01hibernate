package pl.coderslab.app.publisher;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PublisherDao {

    @PersistenceContext
    private EntityManager entityManager;


    public void create(Publisher publisher) {
        entityManager.persist(publisher);
    }

    public Publisher read(Long id) {
        return entityManager.find(Publisher.class, id);
    }

    public void update(Publisher publisher) {
        entityManager.merge(publisher);
    }

    public void delete(Long id) {
        Publisher publisher = read(id);
        if (publisher != null) {
            entityManager.remove(publisher);
        }
    }

    public List<Publisher> findAll(){
        Query query = entityManager.createQuery("select p from Publisher p");
        return query.getResultList();
    }

}