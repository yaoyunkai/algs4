package com.liberty.classes;

public class Manager extends Employee {

    private double bonus;

    public void setBonus(double b) {
        bonus = b;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }


}

