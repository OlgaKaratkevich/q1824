package com.lesson1;

import java.util.Scanner;

public class Season {
    public static void season() {
        String m1 = "January";
        String m2 = "February";
        String m3 = "March";
        String m4 = "April";
        String m5 = "May";
        String m6 = "June";
        String m7 = "July";
        String m8 = "August";
        String m9 = "September";
        String m10 = "October";
        String m11 = "November";
        String m12 = "December";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month name");
        String month = sc.nextLine().trim();


        if (month.equalsIgnoreCase(m1) || month.equalsIgnoreCase(m2) || month.equalsIgnoreCase(m12)) {
            System.out.println("Winter");

        } else if (month.equalsIgnoreCase(m3) || month.equalsIgnoreCase(m4) || month.equalsIgnoreCase(m5)) {

            System.out.println("Spring");
        } else if (month.equalsIgnoreCase(m6) || month.equalsIgnoreCase(m7) || month.equalsIgnoreCase(m8)) {

            System.out.println("Summer");
        } else if (month.equalsIgnoreCase(m9) || month.equalsIgnoreCase(m10) || month.equalsIgnoreCase(m11)) {
            System.out.println("Fall");
        } else {
            System.out.println("Error");
        }
    }
}
