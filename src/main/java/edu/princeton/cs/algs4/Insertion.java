package edu.princeton.cs.algs4;

/**
 * 插入排序对部分有序的数组很有效。
 * <p>
 * TODO: 提高插入排序的速度，将内循环中较大的元素都向右移动而不总是交换两个元素。
 */
public class Insertion {

    private Insertion() {
    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) { // 从第二个元素开始。
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) { // 第二个元素和前一个元素比较，小于的话进行交换, 不小于的话直接break。
                exch(a, j, j - 1);
                // System.out.println(j);
            }
            // System.out.print("out: ");
            // show1(a);
            // System.out.println();
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
        Integer[] a = {7, 1, 5, 6, 4};
        sort(a);
        // show(a);
    }
}
