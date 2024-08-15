package com.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EvenSumAndOddSumDiff {

    public void findDiff() {
        System.out.println("Введите количество элементов массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new Random().ints(n, 0, 100).toArray();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            evenSum = evenSum + arr[i];
        }
        for (int i = 1; i < arr.length; i = i + 2) {
            oddSum = oddSum + arr[i];
        }
        System.out.println(Arrays.toString(arr ));
        System.out.println(Math.abs(evenSum - oddSum));

    }
}
