//Write a program that calculates and displays the sum of squares of digits of number
//29/07/2019
package com.mainacad.modul1;

import java.util.Scanner;

public class Lab1_5_6 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int sum = 0;
        if (number > -10 && number < 10) {
            sum = number * number;
        } else {
            for (int i = 0; ; i++) {
                if (number > -10 && number < 10) {
                    sum = sum + (number * number);
                    break;
                } else {
                    sum = sum + ((number % 10) * (number % 10));
                    number = number / 10;
                }
            }
        }
        System.out.println(sum);
    }
}
