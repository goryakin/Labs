/*
Task There are statistics for the year by months as an array:
 int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
Write code which calculates the maximum value from the array, the minimum value
and the average.
29/07/2019
 */
package com.mainacad.modul1;

import java.util.Arrays;

public class Lab1_6_2 {
    public static void main(String[] args) {
        int[] m = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        int avg = 0;
        Arrays.sort(m);
        System.out.println("min = " + m[0] + "\nmax = " + m[m.length - 1]);
        for (int a : m) {
            avg += a;
        }
        System.out.println("avg = " + avg / m.length);
    }
}

