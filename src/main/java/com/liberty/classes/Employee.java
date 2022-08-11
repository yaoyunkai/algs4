package com.liberty.classes;

import java.time.LocalDate;

/*
 * final 实例域：构建对象时必须初始化这样的域
 * 静态域被类的所有实例共享。
 * 静态常量：static final
 *
 * 重载 overloading
 * 无参构造器
 *
 * interface 特性：
 *      尽管不能构造接口的对象，却能声明接口的变量
 *      接口变量必须弓I用实现了接口的类对象
 *      虽然在接口中不能包含实例域或静态方法，但却可以包含常量。
 *
 *
 * 每个类只能有一个超类，但可以有过个接口实现。
 *
 *
 *
 * */

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary, o.salary);
    }

}
