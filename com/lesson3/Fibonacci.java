package com.lesson3;

import java.util.Arrays;

public class Fibonacci {
    public void generateFibonacciArray(int n) {
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            if(i<2)
                arr[i]=1;
            else
                arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
}