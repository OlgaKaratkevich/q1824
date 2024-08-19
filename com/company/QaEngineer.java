package com.company;

import java.util.Arrays;

public class QaEngineer extends Employee{
    private double SKILLCOEFF = 0.07;

    public QaEngineer(String name, String sname) {
        super(name, sname);
        getPosition();
    }

    @Override
    public Position getPosition() {
        return this.position=Position.QA_ENGINEER;
    }

    @Override
    public double printSalary() {
        return BASE* position.getCoeff()*(1+skillCount*SKILLCOEFF);
    }

    @Override
    public String toString() {
        return "QaEngineer{" +
                "skills=" + Arrays.toString(skills) +
                ", skillCount=" + skillCount +
                ", position=" + position +
                ", name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
