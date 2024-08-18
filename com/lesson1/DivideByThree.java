package com.lesson1;

import java.util.Scanner;

public class DivideByThree {
    public static void divide() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();


        if (num1 < num2) {

            int i;

            int sum = 0;
            for (i=num1+1; i < num2; i++) {
                if (i%3==0) {
                    sum += i;
                }

            }

            System.out.println(sum);
        }
        else if(num1 > num2) {
            int i;

            int sum = 0;
            for (i=num2+1; i < num1; i++) {
                if (i%3==0) {
                    sum += i;
                }

            }

            System.out.println(sum);

        }else {
            }
            System.out.println("Error");
        }

    }

