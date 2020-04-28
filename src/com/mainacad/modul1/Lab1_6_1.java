package com.mainacad.modul1;

import java.util.Arrays;

public class Lab1_6_1 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int elm=0;
        for (int i = 0; i<arr.length; i++) {
            elm=elm+2;
            arr[i]=elm;
        }
        System.out.println(Arrays.toString(arr));
    }
}
