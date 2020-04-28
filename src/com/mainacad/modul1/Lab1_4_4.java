package com.mainacad.modul1;

public class Lab1_4_4 {
    public static void main(String[] args) {
        int a=7;
        System.out.println("a=" +(a++)); //число 7
        System.out.println("a=" +(++a)); //получим 9, так как а=8
        System.out.println("a=" +(a--)); //получим 9, так как а=9
        System.out.println("a=" +(--a)); //получим 7, так как а=7
        System.out.println("a=" +(a++ + a-- + ++a + --a + a));
    }
}
