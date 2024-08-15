package com.library;

public abstract class Product {
    protected String name;
    protected int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public abstract void displayInfo();

    public boolean isAvailable(){
        return quantity > 0;
    }
    public void decreaseQuantity(int quantity){
        if (quantity < this.quantity){
            this.quantity = this.quantity- quantity;
        }else {
            System.out.println("There is no products in library" + "\n————————————————————————————————————");
        }
    }
    public void increaseQuantity(int quantity){
        if (quantity > 0){
            this.quantity += quantity;
        }else {
            System.out.println("Can not increase library stock" + "\n————————————————————————————————————");
        }
    }
}
