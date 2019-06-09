package com.gfg.varunchhabra16.SpringBootWebApp.Model;

public class Book {
    private String book;
    private String ISBN;

    public Book(String book, String ISBN) {
        this.book = book;
        this.ISBN = ISBN;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
