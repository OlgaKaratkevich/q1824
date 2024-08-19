package com.company;

import java.util.Arrays;

public class Director extends Employee{
    private double SKILLCOEFF = 0.1;
    private Project[] projects;
    private int projectsCount;

    public Director(String name, String sname) {
        super(name, sname);
        getPosition();
    }

    @Override
    public Position getPosition() {
        return this.position=Position.DIRECTOR;
    }

    @Override
    public double printSalary() {
        return BASE* position.getCoeff()*(1+skillCount*SKILLCOEFF)+(projectsCount*1000);
    }

    public Project createProject(String name) {
        Project project = new Project(name);
        if (projectsCount < projects.length) {
            projects[projectsCount++] = project;
        }
        return project;
    }

    //public void assignToProject(Employee employee, Project project) {}





    public void promote(Employee employee) {
        switch (employee.position) {
            case JUNIOR_DEVELOPER:
                employee.position = Position.SENIOR_DEVELOPER;
                break;
            case SENIOR_DEVELOPER:                         //в 14 JDK можно через запятую SENIOR_DEVELOPER,QA_ENGINEER
            case QA_ENGINEER:
                employee.position = Position.TEAM_LEAD;
                break;
        }
    }


    @Override
    public String toString() {
        return "Director{" +
                "skills=" + Arrays.toString(skills) +
                ", skillCount=" + skillCount +
                ", position=" + position +
                ", name='" + name + '\'' +
                ", sname='" + sname + '\'' +
                '}';
    }
}
