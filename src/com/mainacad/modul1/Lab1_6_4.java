/*
Write a program, which uses a binary search in a sorted array of integer numbers to find
a certain element.
29/07/2019
 */

package com.mainacad.modul1;
import java.util.Arrays;
public class Lab1_6_4 {
        public static void main(String[] args) {
            int[] array = {2,5,4,1,3};
            Arrays.sort(array);
            int a = Arrays.binarySearch(array, 4);
            System.out.println(a);
        }
    }

