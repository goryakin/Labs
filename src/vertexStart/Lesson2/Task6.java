//6. Зчитати з консолі числа m та n. Вивести найбільше число з проміжку [m,n], яке ділиться націло на 7 або на 9.
package vertexStart.Lesson2;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число m");
        int m = scanner.nextInt();
        System.out.println("Введите число n");
        int n = scanner.nextInt();
        if (m < 7 && n < 7){
            System.out.println("Ни одно число не делится на 7 или 9 без остатка");
        } else {
            if (m > n) {
                int z = m;
                m = n;
                n = z;
            }
            int k = 1;
            for (int i = m; i <= n; i++) {
                if (i % 7 == 0 || i % 9 == 0) {
                    k = i;
                }
            }
            System.out.println(k);
        }
    }
}