package com.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите количество элементов массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.generateFibonacciArray(n);

        MinPlusMax minPlusMax = new MinPlusMax();
        minPlusMax.minMax();

        EvenSumAndOddSumDiff evenSumAndOddSumDiff = new EvenSumAndOddSumDiff();
        evenSumAndOddSumDiff.findDiff();
    }
}
