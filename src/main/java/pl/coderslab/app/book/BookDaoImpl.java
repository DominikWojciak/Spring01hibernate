package pl.coderslab.app.book;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Repository
@Transactional
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void resetRating(double rating) {
        Query query = entityManager.createQuery("update Book b set b.rating = :rating");
        query.setParameter("rating", rating);
        query.executeUpdate();
    }

}