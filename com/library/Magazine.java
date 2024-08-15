package com.library;

public class Magazine extends Product{

    protected int number;

    public Magazine(String name, int quantity, int number) {
        super(name, quantity);
        this.number=number;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + "\nNumber: " + number + "\nIn stock: " + quantity +
        "\n");
    }
}
