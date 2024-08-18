package com.library;

public interface Borrowable {

    public boolean isAvailable();
    public void borrow();
    public void returnItem();
}
