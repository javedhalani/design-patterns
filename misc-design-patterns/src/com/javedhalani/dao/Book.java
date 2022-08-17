package com.javedhalani.dao;

public class Book {

    private int isbn;
    private String name;

    public Book() {
    }

    public Book(int isbn, String name) {
        this.isbn = isbn;
        this.name = name;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setName(String name) {
        this.name = name;
    }
}
