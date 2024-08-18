package com.library;

public class Magazine extends Item{
    protected int year;

    public Magazine(String name, int year) {
        super(name);
        this.year = year;
    }


    @Override
    public void displayInfo() {
        System.out.println("Журнал: " + name + " Год выпуска: " + year + " Доступен: " + available);
    }

    @Override
    public void borrow() {
        if (available){
            available = false;
            System.out.println("Журнал " + name  + " выдан");
        }
        else {
            System.out.println("Журнал " + name + " недступен");
        }
    }

    @Override
    public void returnItem() {
        available = true;
        System.out.println("Журнал " + name +" возвращен");
    }


}

