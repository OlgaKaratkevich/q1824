package com.Lesson11Exceptions;

public class NoRecordsException extends Exception{

    public NoRecordsException(String message){
        super(message);
    }

    public NoRecordsException(){
    }
}
