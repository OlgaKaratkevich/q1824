package com.company;

import java.util.Arrays;

public class TeamLead extends Employee{
    private double SKILLCOEFF = 0.1;

    public TeamLead(String name, String sname) {
        super(name, sname);
        getPosition();
    }

    @Override
    public Position getPosition() {
        return this.position=Position.TEAM_LEAD;
    }

    @Override
    public double printSalary() {
        return BASE* position.getCoeff()*(1+skillCount*SKILLCOEFF);
    }

    @Override
    public String toString() {
        return "TeamLead{" +
                "skills=" + Arrays.toString(skills) +
                ", skillCount=" + skillCount +
                ", position=" + position +
                ", name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
