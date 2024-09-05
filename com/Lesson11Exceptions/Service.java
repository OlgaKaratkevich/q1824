package com.Lesson11Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    public static void main(String[] args) throws NoRecordsException, MemoryOverflowException {
        List<String> list = new ArrayList<>();
       while(true){
           try{
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.equalsIgnoreCase("get")){
            if (list.size()>0){
                System.out.println(list.get(0).toString());
            }
            else throw new NoRecordsException("Нет записей в памяти");
        }
        else if (s.equalsIgnoreCase("exit")){
            break;
        }
        else {
            if (list.size()>=5){
                throw new MemoryOverflowException("Достигнуто максимальное число элементов");
            }
            else {
                list.add(s);
            }
        }

    }
           catch(NoRecordsException e){
               System.out.println("Нет записей в памяти");
           }
           catch (MemoryOverflowException e){
               System.out.println("Достигнуто максимальное число элементов");
           }
       }
}}
