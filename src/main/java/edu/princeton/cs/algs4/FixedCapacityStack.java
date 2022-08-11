package edu.princeton.cs.algs4;

public class FixedCapacityStack<E> {
    private E[] a;
    private int N;

    public FixedCapacityStack(int capacity) {
        a = (E[]) new Object[capacity];
        N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean isFull() {
        return N == a.length;
    }

    public void push(E item) {
        a[N++] = item;
    }

    public E pop() {
        return a[--N];
    }

    public E peek() {
        return a[N - 1];
    }

}
