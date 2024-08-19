package com.company;

import java.util.Arrays;

public class JuniorDeveloper extends Employee{

    private double SKILLCOEFF = 0.05;

    public JuniorDeveloper(String name, String sname) {
        super(name, sname);
        getPosition();
    }

    @Override
    public Position getPosition() {
        return this.position=Position.JUNIOR_DEVELOPER;
    }

    @Override
    public double printSalary() {
        return BASE* position.getCoeff()*(1+skillCount*SKILLCOEFF);
    }

    @Override
    public String toString() {
        return "JuniorDeveloper{" +
                "skills=" + Arrays.toString(skills) +
                ", skillCount=" + skillCount +
                ", position=" + position +
                ", name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
