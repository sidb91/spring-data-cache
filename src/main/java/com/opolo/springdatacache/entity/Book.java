package com.opolo.springdatacache.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    @GenericGenerator(name = "book_sequence_id_generator",
        strategy = "com.opolo.springdatacache.entity.BookSequenceIdGenerator",
        parameters = {
            @Parameter(name="sequence_name", value="book_id_seq"),
            @Parameter(name="initial_value", value="1"),
            @Parameter(name="increment_size", value="50")
    })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_sequence_id_generator")
    private long id;
    private String name;
    private String category;
    private String author;
    private String publisher;
    private String edition;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
