package com.company;

import java.util.Arrays;

public class SeniorDeveloper extends Employee{
    private double SKILLCOEFF = 0.1;

    public SeniorDeveloper(String name, String sname) {
        super(name, sname);
        getPosition();
    }

    @Override
    public Position getPosition() {
        return this.position=Position.SENIOR_DEVELOPER;
    }

    @Override
    public double printSalary() {
        return BASE* position.getCoeff()*(1+skillCount*SKILLCOEFF);
    }

    @Override
    public String toString() {
        return "SeniorDeveloper{" +
                "skills=" + Arrays.toString(skills) +
                ", skillCount=" + skillCount +
                ", position=" + position +
                ", name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
