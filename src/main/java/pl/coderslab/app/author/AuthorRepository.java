package pl.coderslab.app.author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {

    Author findByEmail(String email);

    @Query("select a from Author a where a.email like ?1%")
    Author findByEmailQuery(String email);

    Author findByPesel (String pesel);

    @Query("select a from Author a where a.pesel like ?1%")
    Author findByPeselQuery(String pesel);

    List<Author> findByLastName(String lastName);
}
