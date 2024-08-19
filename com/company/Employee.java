package com.company;

import java.util.Arrays;

public abstract class Employee extends Person {
    protected Position position;
    protected double coeff = getPosition().getCoeff();
    protected final int BASE = 1000;
    protected String[] skills = new String[5];
    protected int skillCount=0;

    public Employee(String name, String sname) {
        super(name, sname);
    }

    public abstract Position getPosition();

    public abstract double printSalary();

    public void addSkills(String skill){
        if (skillCount<skills.length){
            skills[skillCount++]=skill;
        }}

    public String[] getSkill(){return Arrays.copyOf(skills,skillCount);}


    @Override
    public String toString() {
        return "Employee{" + "name=" + name +
                ", surname=" + sname +
                ", skills=" + Arrays.toString(skills) +
                ", position=" + position +
                '}';
    }
}
