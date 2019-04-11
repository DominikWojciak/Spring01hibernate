package pl.coderslab.app.person;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.app.person.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class PersonDao {

    @PersistenceContext
    private EntityManager entityManager;


    public void create(Person person) {
        entityManager.persist(person);
    }

    public Person read(Long id) {
        return entityManager.find(Person.class, id);
    }

    public void update(Person person) {
        entityManager.merge(person);
    }

    public void delete(Long id) {
        Person person = read(id);
        if (person != null) {
            entityManager.remove(person);
        }
    }

}