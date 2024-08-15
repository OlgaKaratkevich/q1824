package com.library;

public class Order {
    protected Customer customer;
    protected Product product;
    protected int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public void processOrder() {
        if (product.isAvailable() && product.quantity >= this.quantity) {
            product.decreaseQuantity(quantity);
            System.out.println("Library order is processed\n——————————————————");
            customer.displayInfo();
            product.displayInfo();
            System.out.println("Ordered: " + this.quantity+"\n——————————————————");
        } else {
            System.out.println("Can not process the order");
        }
    }
}
