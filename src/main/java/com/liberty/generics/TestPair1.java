package com.liberty.generics;


import java.time.LocalDate;

/*
 * https://blog.csdn.net/qq_41701956/article/details/123473592
 *
 * https://blog.csdn.net/Beyondczn/article/details/107093693
 *
 *
 *
 * Java中 [] 和 ... 的区别
 * ... : 可变数组参数，参数可传可不传：https://blog.csdn.net/qq_35091353/article/details/119208309
 * []  : 可以传null,
 *
 * 泛型类：类定义中的类型变量指定方法的返回类型以及域和局部变量的类型。
 *
 * 泛型方法 定义：public static <U> U getMiddle(U[] a)
 *         调用: ArrayAlg.<String>getMiddle(words)
 *
 * 类型变量的限定：extends , 可以有多个限定，可以有多个接口超类，但最多只能有一个类限定
 *
 * 泛型接口。
 *
 *
 * 类型擦除：
无论何时定义一个泛型类型， 都自动提供了一个相应的原始类型 （ raw type)。 原始类型
的名字就是删去类型参数后的泛型类型名。擦除（ erased) 类型变M, 并替换为限定类型 （无
限定的变量用 Object)。

对于 Pair<T> 来说，T是一个无限定的变量，所以直接用Object替换。
原始类型用第一个限定的类型变量来替换， 如果没有给定限定就用 Object 替换。

 * 翻译泛型表达式：当程序调用泛型方法时， 如果擦除返回类型， 编译器插入强制类型转换。
    Pair<Employee> buddies = ...;
    Employee buddy = buddies.getFirst();
擦除 getFirst 的返回类型后将返回 Object 类型。 编译器自动插人 Employee 的强制类型转换。
也就是说，编译器把这个方法调用翻译为两条虚拟机指令：
 - 对原始方法 Pair.getFirst 的调用。
 - 将返回的 Object 类型强制转换为 Employee 类型。

 * 翻译泛型方法：
public static <T extends Compare> T min(T[] a);
public static Compare min(Compare[] a);

类型参数 T 已经被擦除了，只留下了限定类型 Comparable。

- 虚拟机中没有泛型， 只有普通的类和方法。
- 所有的类型参数都用它们的限定类型替换。
- 桥方法被合成来保持多态。
- 为保持类型安全性，必要时插人强制类型转换。

* 通配符类型：<? extends Employee> 类型通配符是类型实参
*
*
 *
 *
 * */
public class TestPair1 {

    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> minmax = ArrayAlg.minmax(words);
        System.out.println("min: " + minmax.getFirst());
        System.out.println("max: " + minmax.getSecond());
        System.out.println("mid: " + ArrayAlg.<String>getMiddle(words));

        // List<String> list = new ArrayList<>();
        // list.add("1");
        // System.out.println(list.get(0));

    }

}

// class Test1<T extends String> {
//
// }
//
// class Test2<T extends Comparable & Serializable> implements Serializable {
//
// }


class ArrayAlg {
    public static Pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) return null;

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (min.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min, max);
    }

    public static <U> U getMiddle(U... a) {
        if (a == null || a.length == 0) return null;
        return a[a.length / 2];
    }

    public static <T extends Comparable> T min(T[] a) {
        if (a == null || a.length == 0) return null;

        T t = a[0];
        for (int i = 1; i < a.length; i++) {
            if (t.compareTo(a[i]) > 0) t = a[i];
        }
        return t;
    }

    public void test() {
        String simpleName = this.getClass().getSimpleName();
        System.out.println(simpleName);
    }

}


class DateInterval extends Pair<LocalDate> {

    public void setSecond(LocalDate second) {
        if (second.compareTo(getFirst()) >= 0) {
            super.setSecond(second);
        }
    }

    /*
    类型擦除之后：

    class DateInterval extends Pair {
        public void setSecond(LocalDate second) {
            if (second.compareTo(getFirst()) >= 0) {
                super.setSecond(second);
            }
        }
    }

    从Pair 继承的方法：
    public void setSecond(Object second)

    编译器生成桥接方法：
    public void setSecond(Object second) { setSecond((Date) second);

    *
    * */
}