package com.library;


public class Book extends Item{

    protected String author;

    public Book(String name, String author) {
        super(name);
        this.author = author;
    }


    @Override
    public void displayInfo() {
        System.out.println("Книга: " + name + " Автор: " + author + " Доступна: " + available);
    }

    @Override
    public void borrow() {
        if (available){
            available = false;
            System.out.println("Книга " + name + " выдана");
        }
        else {
            System.out.println("Книга " + name + " недступна");
        }
    }

    @Override
    public void returnItem() {
        available = true;
        System.out.println("Книга " + name +" возвращена");
    }
}
