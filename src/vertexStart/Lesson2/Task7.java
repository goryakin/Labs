//7. Зчитати з консолі числа m та n. Знайти суму всіх чисел з проміжку [m, n], які діляться на 4 або на 5.
package vertexStart.Lesson2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число m:");
        int m = scanner.nextInt();
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        int sum=0;
          for (int i =m; i <=n ; i++) {
              if (i % 4 == 0 || i % 5 == 0) {
                sum +=i;
              }
          }
        System.out.println(sum);
    }
}
