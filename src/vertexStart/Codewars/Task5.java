/*
Заполнить массив нулями, кроме первого и последнего элементов, которые должны быть равны единице.
http://www.itmathrepetitor.ru/prog/zadachi-na-massivy-2/
 */
package vertexStart.Codewars;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int [] array = new int[7];
        for (int i = 0; i <array.length ; i++) {
            array [i] =1;
            for (int j = 1; j <array.length-1 ; j++) {
            array [j] =0;
            }
        System.out.print(array [i]+", ");
        }

    }
}
