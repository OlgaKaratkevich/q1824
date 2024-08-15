package com.library;

public class Book extends Product {

    private String author;

    private int pages;

    public Book(String name, String author, int quantity, int pages) {
        super(name, quantity);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + "\nAuthor: " + author + "\nPages: " +
                pages + "\nIn stock: " + quantity + "\n");
    }

}
