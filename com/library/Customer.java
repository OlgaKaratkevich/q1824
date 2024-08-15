package com.library;

public class Customer {
    protected String name;
    protected String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void displayInfo(){
        System.out.println("Name: " + name + "\nEmail: " + email + "\n");
    }
}
