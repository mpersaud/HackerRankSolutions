package com.mike.Heap;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        PriorityQueue<Integer> pqLow = new PriorityQueue();
        PriorityQueue<Integer> pqHigh = new PriorityQueue(Collections.reverseOrder());

        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
            pqLow.add(a[a_i]);
            pqHigh.add(a[a_i]);

        }
        System.out.println("we lit");
    }
}