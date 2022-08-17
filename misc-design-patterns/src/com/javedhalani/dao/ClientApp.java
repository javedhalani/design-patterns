package com.javedhalani.dao;

public class ClientApp {

    public static void main(String[] args) {
        BookDao bookDao = new BookDaoImpl();

        bookDao.getAllBooks().stream()
                .forEach(b -> System.out.println("Book ISBN -> " + b.getIsbn() + ", Name ->" + b.getName()));

        // update book
        Book book = bookDao.getAllBooks()
                .stream()
                .filter(b -> b.getIsbn() == 2234)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("ISBN not found"));

        book.setName("Book2-New");
        bookDao.updateBook(book);
        bookDao.getAllBooks().stream()
                .filter(b -> b.getIsbn() == 2234)
                .map(Book::getName)
                .forEach(System.out::println);
    }
}
