package com.lesson7UserService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<User> userSet = new HashSet<>();
        List<User> userList = new ArrayList<>();


        User user1 = new User("John", 25, "Male");
        User user2 = new User("Jane", 23, "Female");
        User user3 = new User("Alice", 30, "Female");
        User user4 = new User("John", 29, "Male");


        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);

        UserService list = new UserService(userList);
        list.SortedList();
        System.out.println("==================================");
        list.findByGenderList("female");
        list.findByNameList("ALice");
        System.out.println("==================================");

        UserService set = new UserService(userSet);
        set.sortedSet();
        System.out.println("==================================");
        set.findByGenderSet("male");
        set.findByNameSet("John");


    }
}
