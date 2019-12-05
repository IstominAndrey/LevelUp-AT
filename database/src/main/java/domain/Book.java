package domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Table (name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="id")
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column (name = "isbn")
    private String isbn;

    @Column (name = "year")
    private Integer year;

    @Column (name = "publisher_id")
    private Integer publisher_id;

    public Book (String name, String isbn, Integer year, Integer publisher_id) {
        this.name = name;
        this.isbn = isbn;
        this.year = year;
        this.publisher_id = publisher_id;
    }

}
