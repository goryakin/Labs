/*
5. Зчитати з консолі 2 числа: n та m. Створити масив на n елементів.
Заповнити його послідовністю, вигляду m, m-2, m-4, m-6 і т.д.
 Вивести результуючий масив на екран.
 */
package vertexStart.Lesson3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        System.out.println("Введите m: ");
        int m = scanner.nextInt();
        for (int i = n-1; i <=arr.length ; i--) {
            arr [i]=m;
            m = m-2;
            System.out.println(arr[i]);
        }
    }
}
