package com;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinPlusMax {
    public static void minMax(String[] args) {
        System.out.println("Введите количество элементов массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new Random().ints(n,0,1000).toArray();
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Массив: " + Arrays.toString(arr) +"\nmin: "+min+"\nmax: "+max);
        System.out.println("Сумма минимального и максимального эллемента: " + (min+max));
    }
}
