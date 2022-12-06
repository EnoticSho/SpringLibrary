package com.example.SpringLibrary.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Person")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "birthdate")
    private int year;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private List<Book> bookList;

    public Person(int id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public Person() {
    }

    public void addBookToPerson(Book book) {
        if (bookList.isEmpty()) {
            bookList = new ArrayList<>();
        }
        bookList.add(book);
        book.setPerson(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return name + ", " + year;
    }
}
