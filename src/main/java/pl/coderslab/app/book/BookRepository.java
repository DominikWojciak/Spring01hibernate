package pl.coderslab.app.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByProposition(boolean proposition);

    List<Book> findByTitle(String title);

    @Query("select b from Book b where b.title = ?1")
    List<Book> findByTitleQuery(String title);

    @Query(value = "select * from books where mytitle = ?1", nativeQuery = true)
    List<Book> findByTitleNativeQuery(String title);

    List<Book> findByCategoryId(Long id);

    @Query("select b from Book b where b.category.id = :categoryId")
    List<Book> findByCategoryIdQuery(@Param("categoryId") Long id);

    List<Book> findByAuthorsId(Long id);

    @Query("select b from Book b where b.publisher.id = :publisherId")
    List<Book> findByPublisherQuery(@Param("publisherId") Long id);

    List<Book> findByPublisherId(Long id);

    @Query("select b from Book b where b.rating between ?3 and ?5")
    List<Book> findByRatingBetweenQuery(double min, double max);

    List<Book> findByRating(double rating);

    @Query(value = "select * from books where category_id = ?1 order by mytitle asc limit 1", nativeQuery=true)
    Book findFirstByCategoryIdOrderByTitle(Long id);
}