package pl.coderslab.app.publisher;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.pl.NIP;
import org.hibernate.validator.constraints.pl.REGON;

import javax.persistence.*;
@Entity
@Table(name = "publishers")
public class Publisher {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    @NotBlank
    private String name;

    @NIP
    private String nip;

    @REGON
    private String regon;


    public Long getId() {
        return id;
    }    public void setId(Long id) {
        this.id = id;
    }    public String getName() {
        return name;
    }    public void setName(String name) {
        this.name = name;
    }
}