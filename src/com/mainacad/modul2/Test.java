package com.mainacad.modul2;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число от 4 до 100: ");
       Scanner scan=new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(Math.sqrt(number)); //вычисление корня квадратного
    }
}