package edu.princeton.cs.algs4;

/**
 * 快速排序
 * <p>
 * 性能特点：
 * 1. 比较次数很少
 * 2. 排序效率依赖于切分数组的效果，而这依赖于切分元素的值
 * <p>
 * 在排序小数组时，应该切换到插入排序。
 * 三分取样法
 */
public class Quick {

    private Quick() {
    }

    /**
     * Rearranges the array in ascending order, using the natural order.
     *
     * @param a the array to be sorted
     */
    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    // quicksort the subarray from a[lo] to a[hi]
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        // 对于j，a[j] 已经排定
        // a[lo] 到 a[j-1] 中的所有元素都不大于a[j]
        // a[j+1] 到 a[hi] 中的所有元素都不小于a[j]

        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {

            // find item on lo to swap
            while (less(a[++i], v)) {
                if (i == hi) break; // 只移动指针，退出循环的条件遇到比a[lo]大的数
            }

            // find item on hi to swap
            while (less(v, a[--j])) {  // 一定会被移动一次????
                if (j == lo) break;      // redundant since a[lo] acts as sentinel  // 只移动指针
            }

            // check if pointers cross
            if (i >= j) break;

            exch(a, i, j);
        }

        // put partitioning item v at a[j]
        exch(a, lo, j);

        // now, a[lo .. j-1] <= a[j] <= a[j+1 .. hi]
        return j;
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
}
