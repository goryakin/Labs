package com.mainacad.modul1;
import java.util.Scanner;
public class Lab1_5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number x: ");
        int x = input.nextInt();
        String inWords;
        switch(x){
            case 1: inWords = "One";
                break;
            case 2: inWords = "Two";
                break;
            case 3: inWords = "Three";
                break;
            case 4: inWords = "Four";
                break;
            case 5: inWords = "Five";
                break;
            case 6: inWords = "Six";
                break;
            case 7: inWords = "Seven";
                break;
            case 8: inWords = "Eight";
                break;
            case 9: inWords = "Nine";
                break;
            default: inWords = "Other";
        }
        System.out.println(inWords);

    }
    }

