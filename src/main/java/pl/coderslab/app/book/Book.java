package pl.coderslab.app.book;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import pl.coderslab.app.author.Author;
import pl.coderslab.app.category.Category;
import pl.coderslab.app.publisher.Publisher;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 5, groups = {BookValidationGroup.class, PropositionValidationGroup.class})
    @Column(name="mytitle")
    private String title;

    @NotEmpty(groups = BookValidationGroup.class)
    @ManyToMany
    private List<Author> authors;

    @Min(value = 1, groups = BookValidationGroup.class)
    @Max(value = 10, groups = BookValidationGroup.class)
    private double rating;

    @NotNull(groups = BookValidationGroup.class)
    @ManyToOne
    private Publisher publisher;

    @NotBlank(groups = PropositionValidationGroup.class)
    @Size(max = 600, groups = {BookValidationGroup.class, PropositionValidationGroup.class})
    private String description;

    @Min(value = 2, groups = BookValidationGroup.class)
    private int pages;

    private boolean proposition;

    @ManyToOne
    private Category category;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isProposition() {
        return proposition;
    }

    public void setProposition(boolean proposition) {
        this.proposition = proposition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                ", description='" + description + '\'' +
                '}';
    }
}