package edu.princeton.cs.algs4;

/**
 * 首先，找到数组中最小的那个元素，将他和数组的第一个元素交换位置。
 * <p>
 * 再在剩下的元素中找到最小的元素，将他与数组的第二个元素交换位置。
 * <p>
 * 交换总次数是N。
 * <p>
 * 运行时间和输入无关。
 * <p>
 * 数据移动最少。
 */
public class Selection {

    private Selection() {
    }

    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(a[j], a[min])) min = j;
            } // 在i到n之间，找到最小一个元素
            exch(a, i, min); // 一轮寻找之后，和i位置交换元素。
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

    public static void main(String[] args) {
        Integer[] a = {5, 2, 3, 4, 6, 7, 9, 1, 8, 0};
        sort(a);
        show(a);
    }

}
