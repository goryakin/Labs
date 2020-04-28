/*
10. Создать массив, на четных местах в котором стоят единицы,
а на нечетных местах - числа, равные номеру индекса плюс 5.
i0=1, i1 = 1+5=6, i2 =1, i3 = 3+5=8, i4 =1, i5= 5+5=10
 */
package vertexStart.Codewars;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int [] arr = new int [10];
        for (int i = 0; i <arr.length ; i++) {
        if (i%2==0) {
            arr [i] =1;
        }
        else {
            arr [i] = i +5;
        }
        }
        System.out.println(Arrays.toString(arr));
    }
}
