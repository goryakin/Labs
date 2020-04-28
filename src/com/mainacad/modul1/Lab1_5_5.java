/*
Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n.
Also compute and display the average.
The output shall look like:
The Sum is: 100
The Avg is: 10
29/07/2019
 */
package com.mainacad.modul1;

public class Lab1_5_5 {
    public static void main(String[] args) {
        int n;
        n=20;
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
        sum += i; //можно записать sum=sum+i, где i начинается c 1 и до 20
        }
        float avg = sum / n;
            System.out.println("сумма чисел=" +sum);
        System.out.println("среднее значение=" +avg);

        }
    }

