package edu.princeton.cs.algs4;

/**
 * 希尔排序
 * <p>
 * 使数组中任意间隔为h的元素都是有序的。  h有序数组
 * 为实现更小的h有序创造方便。
 */
public class Shell {
    private Shell() {
    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        int h = 1;
        while (h < n / 3) h = 3 * h + 1; // h=4, 取h的增长因子

        while (h >= 1) {
            for (int i = h; i < n; i++) {
                // 实现h间隔有序，所以距离都是h, 控制的都是比j小的元素。
                // 从h开始到长度减一结束，当外循环结束时，就会变成h有序数组
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h) {
                    exch(a, j, j - h);
                }
            }
            System.out.print("out: ");
            show1(a);
            System.out.println();
            h /= 3;  // 缩小因子
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }
    }

    private static void show1(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i]);
            StdOut.print(" ");
        }
    }

    public static void main(String[] args) {
        // Integer[] a = {5, 3, 2, 4, 6, 7, 9, 1, 8, 0};
        // sort(a);
        // show(a);
        String[] s = {"S", "H", "E", "L", "L", "S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        sort(s);
        show(s);
    }
}
