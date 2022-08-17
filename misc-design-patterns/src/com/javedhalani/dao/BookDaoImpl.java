package com.javedhalani.dao;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao {

    // Books from db
    private List<Book> books;

    public BookDaoImpl() {
        this.books = new ArrayList<>();
        books.add(new Book(1234, "book1"));
        books.add(new Book(2234, "book2"));
        books.add(new Book(3234, "book3"));
        books.add(new Book(4234, "book4"));

    }

    @Override
    public List<Book> getAllBooks() {
        return this.books;
    }

    @Override
    public Book getBookByIsbn(int isbn) {
        return this.books.stream()
                .filter(b -> b.getIsbn() == isbn)
                .findFirst()
                .orElseThrow(() ->  new RuntimeException("ISBN does not exists in DB"));
    }

    @Override
    public void saveBook(Book book) {
        this.books.add(book);
    }

    @Override
    public void updateBook(Book book) {
        for(Book item : this.books) {
            if (item.getIsbn() == book.getIsbn()) {
                item.setName(book.getName());
                return;
            }
        }
    }

    @Override
    public void deleteBook(Book book) {
        this.books.remove(book);
    }
}
