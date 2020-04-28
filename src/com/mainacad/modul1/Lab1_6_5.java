/*
Write a program, which transpose matrix (2d arrays, size 4x4) and outputs it to the console
29/07/2019
 */
package com.mainacad.modul1;

import java.util.Arrays;

public class Lab1_6_5 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int k = 0;
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j <= arr.length; j++) {
                arr[i][j] = k;
                k++;
                for (i = 0; i <= arr.length; i++) {
                    for (j = 0; j < arr.length; j++) {
                    }
             System.out.println(Arrays.toString(arr));


                }
            }
    }
}