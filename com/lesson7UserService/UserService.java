package com.lesson7UserService;

import java.util.*;

public class UserService {

    private List<User> userList;
    private Set<User> userSet;

    public UserService(List<User> userList) {
        this.userList = userList;
    }

    public UserService(Set<User> userSet){
        this.userSet = userSet;
    }

    public void findByNameList(String name){
        List<User> result = new ArrayList<>();
        for (User user : userList){
            if (user.name.equalsIgnoreCase(name)){
                result.add(user);
                System.out.println(result);
            }

        }
    }

    public void findByGenderList(String gender){
        List<User> result = new ArrayList<>();
        for (User user : userList){
            if (user.gender.equalsIgnoreCase(gender)){
                result.add(user);
            }
        }
        System.out.println(result);
    }

    public void SortedList(){
        List<User> result = new ArrayList<>(userList);
        Collections.sort(result);
        System.out.println(result);
    }

    public void findByNameSet(String name){
        Set<User> result = new HashSet<>();
        for (User user : userSet){
            if (user.name.equalsIgnoreCase(name)){
                result.add(user);
            }
        }
        System.out.println(result);
    }

    public void findByGenderSet(String gender){
        Set<User> result = new HashSet<>();
        for (User user : userSet){
            if (user.gender.equalsIgnoreCase(gender)){
                result.add(user);
            }
        }
        System.out.println(result);
    }

    public void sortedSet(){
        Set<User> result = new HashSet<>(userSet);
        List<User> sortedList = new ArrayList<>(result);
        Collections.sort(sortedList);
        System.out.println(sortedList);
    }


}
