package com.mainacad.modul1;


public class Hello {
    public static void main(String[] args) {

        int a = 10;
        try {
            try {
                if (a < 20) {
                    throw new Exception();
                }
            } catch (Exception ex) {
                a += 10;
                throw new RuntimeException();
            }
        } catch (Throwable th) {
            a += 5;
        } finally {
            a += 5;
        }
        System.out.println(a);
    }

}