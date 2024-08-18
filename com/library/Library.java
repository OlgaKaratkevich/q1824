package com.library;

public class Library {
    private Item[] items;
    private int itemCount;

    public Library(int capacity){
        this.items = new Item[capacity];
        this.itemCount = 0;
    }

    public void addItem(Item item){
        if(itemCount<items.length){
            items[itemCount] = item;
            itemCount++;
            System.out.println("Добавлено: " +item.getName());
        }
        else {
            System.out.println("Библиотека заполена");
        }
    }

    public void displayAvailableItems(){
        for (int i =0;i<itemCount;i++){
            if (items[i].isAvailable()){
                items[i].displayInfo();
            }
        }
    }

    public void borrowItem(String name){
        for(int i=0;i<itemCount;i++){
            if(items[i].getName().equals(name)){
                items[i].borrow();
                break;
            }else {
                System.out.println("Элемент не найден в библиотеке");
                break;
            }
        }
    }


    public void returnItem(String name){
        for(int i=0;i<itemCount;i++){
            if(items[i].getName().equals(name)){
                items[i].returnItem();
                break;
            }else {
                System.out.println(name + " не из нашей библиотеки");
                break;
            }
        }
    }


}










