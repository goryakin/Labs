/*
9. Создать массив, каждый элемент которого равен квадрату своего номера.
 */
package vertexStart.Codewars;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int [] arr = new int [10];
        for (int i = 0; i <arr.length ; i++) {
            arr [i]=i*i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
