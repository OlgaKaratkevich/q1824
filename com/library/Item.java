package com.library;

public abstract class Item implements Borrowable{
    protected String name;
    protected boolean available;

    public Item(String name) {
        this.name = name;
        this.available = true;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }


}

