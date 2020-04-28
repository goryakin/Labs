/*
3. Заполнить массив последовательными нечетными числами, начиная с единицы.
 */
package vertexStart.Codewars;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int number = 1;
        for (int i = 0; i < arr.length; i++) {
           arr [i] =number;
           number++;
            if (number % 2 == 1) {
                arr[i] = number;
                number++;
            }
        //    System.out.print(arr[i]+ ", " );
        }
        System.out.println(Arrays.toString(arr));
    }
}
