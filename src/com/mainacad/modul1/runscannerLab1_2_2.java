package com.mainacad.modul1;
import java.util.Scanner; // импорт сканера
public class runscannerLab1_2_2 {
         public static void main(String args[]){
            System.out.print("Введите любое целое число от 1 до 10: ");
            Scanner scanconsol = new Scanner(System.in); //объявить сканер
            int number = scanconsol.nextInt(); //считать число с консоли
            System.out.println ("Вы ввели число " + number); //вывести введённое пользователем число в консоль
        }
}
