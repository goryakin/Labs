/*
The program must print the first 10 numbers that is divisible evenly by 3 or 4, but for
loop iterates from 1 to 300 (so break statement must be used after 10 printed result).
The output shall look:
3
4
…
20
29/07/2019
 */
package com.mainacad.modul1;

public class Lab1_5_4 {
    public static void main(String[] args) {
  //      int count = 0;
        for (int i = 1; i <= 30; i++)
        if (i % 3 == 0 || i % 4 == 0) { //делятся или на 3 и на 4
                System.out.println(i);
  //              count++;
   //             if (count == 10) //печатает первые 10 чисел, потом прерываем
   //                 break;
                {

                }
            }
    }
}
//      if (i % 3 == 0 && i % 4 == 0) { одновременно делятся на 3 и на 4
