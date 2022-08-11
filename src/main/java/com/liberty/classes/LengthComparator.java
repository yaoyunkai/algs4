package com.liberty.classes;

import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }

    public static void main(String[] args) {
        String[] strings = {"asd", "ss", "cccc"};
        Arrays.sort(strings, new LengthComparator());
        for (String s : strings) {
            System.out.println(s);
        }
        Comparator<String> comp
                = (first, second) // Same as (String first, String second)
                -> first.length() - second.length();

    }


}
