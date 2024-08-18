package com.lesson1;

import java.util.Scanner;

public class Exit {
    public static void exit(){
    Scanner sc = new Scanner(System.in);
    String exit;
        System.out.println("Enter 'exit' for exit");
        while (true){
        exit=sc.nextLine().trim();
        if (exit.equalsIgnoreCase("exit")){
            System.out.println("exit");
            break;

        } else {
            System.out.println("Enter 'exit' for exit");
        }
    }
}}
