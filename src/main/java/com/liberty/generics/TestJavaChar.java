package com.liberty.generics;

public class TestJavaChar {

    public static void main(String[] args) {

        /*
         * char 类型的值可以表示为十六进制值， 其范围从 \u0000 到 \Uffff。
         *
         * 在 Java 中，char 类型描述了 UTF-16 编码中的一个代码单元。
         *
         * 我们强烈建议不要在程序中使用 char 类型， 除非确实需要处理 UTF-16 代码单元。最好将字符串作为抽象数据类型处理
         *
         * */
        char a = 'c';
        char b = '我';

        String c = "Java\u2122";
        System.out.println(c);
        System.out.println("code point length: " + c.codePointCount(0, c.length()));
    }

}
