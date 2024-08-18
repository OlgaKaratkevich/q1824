package com.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);



        library.addItem(new Book("1984","Дж.Оруэлл"));
        library.addItem(new Book("Война и мир","Л.Толстой"));

        library.displayAvailableItems();

        System.out.println("-------------------------------");

        library.borrowItem("1984");
        library.displayAvailableItems();
        System.out.println("-------------------------------");

        library.borrowItem("1984");
        library.returnItem("1984");
        library.displayAvailableItems();
        System.out.println("-------------------------------");

        library.returnItem("Гарри Поттер");

    }
}
