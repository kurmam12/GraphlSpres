package com.de.le.graphlspres.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Books")
public class Books {
    @Id
    @Column(name = "bookid")
    private Long id;
    @Column(name="bookname")
    private String bookName;
    @Column(name="author")
    private String author;
    @Column(name="genre")
    private String genre;
    @Column(name="isbn")
    private String isbn;

    public Books() {
    }

    public Books(Long id, String bookName, String author, String genre, String isbn) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

}
