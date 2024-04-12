package com.renelouis.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

    public long getId() {
        return id;
    }

    public void setTitle(String randomAlphabetic) {
        this.title = randomAlphabetic;
        System.out.printf("\nBook title: %s", randomAlphabetic);
    }

    public void setAuthor(String randomAlphabetic) {
        this.author = randomAlphabetic;
        System.out.printf("\nBook Author: %s", randomAlphabetic);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long parseLong) {
        this.id = parseLong;
    }
}