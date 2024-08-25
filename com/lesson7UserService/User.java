package com.lesson7UserService;

import java.util.Objects;

public class User implements Comparable<User> {

    protected String name;
    protected int age;
    protected String gender;

    public User(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(gender, user.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

  @Override
    public int compareTo(User o) {
        int ageComparison = Integer.compare(this.age,o.age);
        if (ageComparison != 0) {
            return ageComparison;
        }
        return this.name.compareToIgnoreCase(o.name);
    }

}
