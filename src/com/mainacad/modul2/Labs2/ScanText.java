package com.mainacad.modul2.Labs2;

import java.util.Scanner;

public class ScanText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ведите фразу");
        String slovo = scan.nextLine();
        System.out.println("вы ввели "+slovo);
    }
}
