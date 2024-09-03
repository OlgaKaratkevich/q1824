package com.lesson10;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      /*int[] array = new Random().ints(10, 0, 100).toArray();
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
        System.out.println(list.stream().filter(i->i%2==0).reduce((x,y)->x+y).get());*/

      List<Parent> parents = Arrays.asList(
              new Parent("Parent1", 35, Arrays.asList(
                      new Child("child11",5,false),
                      new Child("child12",14,false))),
              new Parent("Parent2", 40, Arrays.asList(
                      new Child("child21",15,true),
                      new Child("child22",20,false),
                      new Child("child23",21,true))),
              new Parent("Parent3", 46, Arrays.asList(
                      new Child("child31",5,true),
                      new Child("child32",14,false),
                      new Child("child33",16,false),
                      new Child("child34", 25,true))
              ));

      parents.stream()
              .flatMap(parent -> parent.getChildren().stream())
              .filter(child -> child.getName().contains("2"))
              .forEach(System.out::println);
      System.out.println("-------------------------------------");
      parents.stream()
              .filter(parent -> parent.getChildren().size()>3)
              .forEach(System.out::println);
      System.out.println("-------------------------------------");
      parents.stream()
              .flatMap(parent -> parent.getChildren().stream())
              .filter(child -> child.isMale()==true)
              .forEach(System.out::println);
      System.out.println("-------------------------------------");
      parents.stream()
              .flatMap(parent -> parent.getChildren().stream())
              .filter(child -> child.isMale()==false)
              .forEach(System.out::println);
      System.out.println("-------------------------------------");
      parents.stream()
              .flatMap(parent -> parent.getChildren().stream())
              .map(child -> child.getName())
              .map(Object::toString)
              .map(String::toUpperCase)
              .forEach(System.out::println);




    }
}
