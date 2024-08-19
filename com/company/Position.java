package com.company;

public enum Position {

    DIRECTOR(2),
    QA_ENGINEER(1.2),
    TEAM_LEAD(1.7),
    SENIOR_DEVELOPER(1.5),
    JUNIOR_DEVELOPER(1.1);


    private final double coeff;

    Position(double coeff) {
        this.coeff = coeff;
    }

    public double getCoeff() {
        return  coeff;
    }
}
