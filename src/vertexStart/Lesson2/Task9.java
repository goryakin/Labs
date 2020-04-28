/*
9. Ви взяли у банку гроші на суму m (вводиться з консолі) під 20% на рік.
 Через скільки років сума, яку ви повинні віддати банку, подвоється?
 */
package vertexStart.Lesson2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму кредита");
        int m = scanner.nextInt();
        int sum = 0;
             while (sum < m) {
             sum = sum + (m / 5);
        }
        System.out.println("Через "+sum/(m/5) + " лет сумма долга удвоится");
    }
}

