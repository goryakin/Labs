/*
Write a program, which creates square matrix like those in the figure below and prints
them formatted to the console. The size of the matrix is 4 x 4:
29/07/2019
 */
package com.mainacad.modul1;

import java.util.Arrays;

public class Lab1_6_3 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int counter = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[j][i] = counter;
                counter++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (array[i][j] < 10) {
                    System.out.print(" " + array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int[] ar : array){
            System.out.println(Arrays.toString(ar));
        }
    }
}


