package com.company.Array;

public class array2 {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };
        int[][] a1=new int[3][4];
        System.out.println(a[0][1]);
        a[0][0]=7;
        System.out.println(a[0][0]);
        System.out.println("-----------------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                System.out.println(a1[i][j]+",");
            }
            System.out.println();
        }
    }
}
