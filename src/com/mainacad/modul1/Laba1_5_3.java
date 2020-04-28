package com.mainacad.modul1;

public class Laba1_5_3 {
    public static void main(String[] args) {
        int j=1;
        System.out.println("* | 1 2 3 4 5 6 7 8 9");
        System.out.println("-----------------------------------------");
        for(int i=1;i<=9;i++){
            System.out.print(i + " " + "|");
            for(j=1;j<=9;j++){
                int m = j*i;
                System.out.print(" " + m);
            }
            System.out.println();
        }

    }
}

