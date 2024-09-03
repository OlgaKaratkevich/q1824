package com.lesson10;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
      int[] array = new Random().ints(10, 0, 100).toArray();
        System.out.println(Arrays.toString(array));
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

        Integer min = list.stream()
                .min(Integer::compare).get();
        System.out.println(min);

        Integer max = list.stream()
                .max(Integer::compare).get();
        System.out.println(max);

        list.stream().filter(i->i>=5).forEach(result -> System.out.print(result + " "));
        System.out.println("\n");
        System.out.println(list.stream().filter(i->i%2==0).reduce((x,y)->x+y).get());



    }
}
