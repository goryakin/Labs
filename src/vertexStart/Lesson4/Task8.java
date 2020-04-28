/*
Задача 8
--------------------------
Потрібно зберігати оцінки m студентів по n предметам. Кількість студентів і оцінки можуть вводитися,
 генеруватися випадковим чином або задаватися фіксовано (на ваш вибір). Потрібно:
- вивести середній бал кожного студента
- вивести студентів, які не отримали жодної 5
- вивести студентів-відмінників (тільки 5)
 */
package vertexStart.Lesson4;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов m");
        int m = scanner.nextInt();
        System.out.println("Введите количество предметов n");
        int n = scanner.nextInt();
        int minGrade = 0;
        int maxGrade = 5;
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = ((int) (Math.random() * (maxGrade - minGrade + 1) + minGrade));
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int average;
        average = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                average += array[i][j];
                average /= n;
            }
            System.out.println(average);

        }

    }
}