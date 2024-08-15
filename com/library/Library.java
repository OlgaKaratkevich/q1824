package com.library;

public class Library {
    public static void main(String[] args) {
        Product book = new Book("Book", "Author", 8, 210);
        book.displayInfo();
        Product magazine = new Magazine("Magazine", 10, 10);
        magazine.displayInfo();
        Customer customer1 = new Customer("Vasya", "Vasya@email.com");
        customer1.displayInfo();
        Order order1 = new Order(customer1, book, 3);
        order1.processOrder();
    }
}
