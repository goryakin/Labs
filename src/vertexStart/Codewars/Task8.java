/*
4. Сформировать массив из элементов арифметической прогрессии с заданным первым элементом x и разностью d.
 */
package vertexStart.Codewars;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int [] arr = new int [10];
        int x =2;
        int d =3;
        for (int i = 0; i <arr.length ; i++) {
            arr [i]=x;
            x=x+d;
        }
        System.out.println(Arrays.toString(arr));
    }
}
