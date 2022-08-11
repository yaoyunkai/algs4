package com.liberty.classes;

public class ManagerTest {

    public static void main(String[] args) {
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        /* 1. 将一个子类的对象赋给超类变量*/
        Employee e;
        e = boss;
        e = new Employee("bob", 4000, 1988, 12, 3);

        /* 2. error*/
        // Employee[] staff = new Employee[3];
        // staff[0] = boss;
        // staff[0].setBonus(5000);

        /* 3. error*/
        // Manager[] managers = new Manager[10];
        // Employee[] staff = managers;
        //
        // staff[0] = new Employee("bob", 4000, 1988, 12, 3);

        Class<? extends Manager> aClass = boss.getClass();
        System.out.println(aClass.getSimpleName());
    }
}


// abstract class Person {
//     public final static String name = "TOM";
//
// }