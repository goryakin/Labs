/*
Задача 7
---------------------------
Задати з консолі числа m, n. Створити двомірний масив розміром m на n.
Заповнити його випадковими цілими числами в діапазоні [-11:11].
Замінити всі додатні числа в згенерованому масиві на їхні квадрати, а всі від'ємні замінити на нулі.
 */
package vertexStart.Lesson4;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число строк m");
        int m = scanner.nextInt();
        System.out.println("Введите число столбцов n");
        int n = scanner.nextInt();
        int min = -11;
        int max = 11;
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ((int) (Math.random() * (max - min + 1) + min));
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] > 0) {
                    array[i][j] = array[i][j] * array[i][j];
                }
                    if (array[i][j] < 0) {
                        array[i][j] = 0;
                    }
                    System.out.print(array[i][j] + "\t");
                }
            System.out.println();
        }
   }
}
