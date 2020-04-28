/*
Задача 6
-----------------------
Задати з консолі числа m, n. Створити двомірний масив розміром m на n.
Заповнити його випадковими цілими числами в діапазоні [13:41]. Порахувати суму елементів у кожному рядку.
Вивести індекс рядка, де ця сума найбільша.

 */
package vertexStart.Lesson4;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк m");
        int m = scanner.nextInt();
        System.out.println("Введите число столбцов n");
        int n = scanner.nextInt();
        int min = 13;
        int max = 41;
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ((int) (Math.random() * (max - min + 1) + min));
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
            int sum;
            sum = 0;
            for (int j = 0; j < n; j++) {
             sum = sum+array[i][j];
          }
            System.out.println("Сумма єлементов в строке "+ sum);
        }
    }
}
//доделать индекс максимальной по сумме строки

