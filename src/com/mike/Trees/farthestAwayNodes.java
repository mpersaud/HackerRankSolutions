package com.mike.Trees;

public class farthestAwayNodes {

    static  int[] treeBottom(String tree) {

        return new int[]{0};
    }

    public static void main(String[] args) {

        String s = "(2 (7 (2 () ()) (6 (5 () ()) (11 () ()))) (5 () (9 (4 () ()) ())))";
        treeBottom(s);

    }
}
