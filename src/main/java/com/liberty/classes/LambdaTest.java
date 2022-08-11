package com.liberty.classes;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/*
* 对于只有一个抽象方法的接口， 需要这种接口的对象时， 就可以提供一个 lambda 表达式。 这种接口称为函数式接口 （functional interface )。
*
*
*
* */
public class LambdaTest {

    public static void main(String[] args) {
        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer timer = new Timer(1000, e -> System.out.println("the time is " + new Date()));
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);

    }
}
