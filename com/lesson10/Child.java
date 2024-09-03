package com.lesson10;

import java.util.Objects;

public class Child {

    private String name;
    private Integer age;
    private boolean isMale;

    public Child(String name, Integer age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isMan=" + isMale +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return isMale == child.isMale && Objects.equals(name, child.name) && Objects.equals(age, child.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, isMale);
    }
}
