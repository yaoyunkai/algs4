package com.liberty.generics;

import java.util.ArrayList;


/*
 * https://docs.oracle.com/javase/tutorial/extra/generics/index.html
 *
 *
 * 形参和实参的概念
 *
 * 通配符类型 （wildcard type)
 *
 * */
public class DemoIntro {

    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // list.add("java");
        // list.add(123);
        // list.add(true);
        //
        // for (Object o : list) {
        //     String str = (String) o;
        //     // 类型转换异常
        //     System.out.println(str);
        // }

        ArrayList<String> strArray = new ArrayList<>();
        strArray.add("item");
        strArray.add("item2");
        strArray.add("item3");
        strArray.add("item4");

        for (String s : strArray) {
            System.out.println(s);
        }

    }

}
