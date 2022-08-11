package com.liberty.generics;

import java.util.ArrayList;

public class TestInitArray {
    ArrayList<Integer> list = new ArrayList<>(10);

    public static void main(String[] args) {
        TestInitArray test1 = new TestInitArray();
        TestInitArray test2 = new TestInitArray();

        System.out.println(test1.list == test2.list);

    }

}
