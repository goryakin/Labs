/*
Task Write a program that sorts an array of average temperature values by months of 2015
as follows: at first the negative values, then - positive values
Preparation No special preparation
29/07/2019
 */
package com.mainacad.modul1;

import java.util.Arrays;

public class Lab1_6_6 {
    public static void main(String[] args) {
int [] arr = new int [12];
arr [0]= -20;
arr [1]= -15;
arr [2]= -5;
arr [3]= 0;
arr [4]= +5;
arr [5]= +20;
arr [6]= +24;
arr [7]= +1;
arr [8]= -1;
arr [9]= -7;
arr [10]= -11;
arr [11]= -18;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
