package com.mainacad.modul1;

public class Lab1_5_1 {
    public static void main(String[] args) {

        for (int i = 1; i < 9; i++) {

            System.out.print(i);

            for (int n = i - 1; n > 0; n--) {

                System.out.print(n);
            }
            System.out.println();
        }
    }
}

