package com.Lesson11Exceptions;

public class MemoryOverflowException extends Exception {

    public MemoryOverflowException(String message){
        super(message);
    }

    public MemoryOverflowException(){
    }
}
