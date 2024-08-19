package com.company;

public abstract class Person {

    protected final String name;
    protected final String sname;

    public Person(String name, String sname) {
        this.name = name;
        this.sname = sname;
    }

    public String getName() {
        return name;
    }

    public String getSname() {
        return sname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
