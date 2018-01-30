package com.mike.LongestSubString;
import java.util.Random;

import java.util.*;

public class Main {


    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;


        for (int i = 0, j = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(j, map.get(s.charAt(j) + 1));
            }
            map.put(s.charAt(j), j);
            max = Math.max(max, j - i + 1);
        }
        return max;

    }
    public static int[][] genNewMatrix(int n) {
        int [][]A=new int[n][n];
        Random R=new Random();


        int i,j;
        for( i=0; i < n ; i++ ) {
            for( j=0; j < n ; j++ ) {
                A[i][j]=R.nextInt(256);
            }
        }
        return A;

    }

    public static void rotate(){

    }
    static void transpose(int arr[][])
    {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr[0].length; j++)
            {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
    }
    static void reverseColumns(int arr[][])
    {
        for (int i = 0; i < arr[0].length; i++)
            for (int j = 0,  k = arr[0].length - 1;
                 j < k; j++, k--)
            {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
            }
    }

    public static void main(String[] args) {
        int x = 10;
        int [][] matrix = genNewMatrix(4);
        for(int i =0;i<matrix.length;i++){
            for(int j=0 ; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        transpose(matrix);
        System.out.println();
        for(int i =0;i<matrix.length;i++){
            for(int j=0 ; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
