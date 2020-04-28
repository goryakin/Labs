//4. Зчитати з клавіатури числа k та n. Вивести в консоль числа в проміжку [k,n].
package vertexStart.Lesson2;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число k");
        int k = scanner.nextInt();
        System.out.println("Введите втрое число n");
        int n = scanner.nextInt();
        if (n > k) {
            for (int i = k; i <= n; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = n; i <= k; i++) {
                System.out.println(i);
            }
        }
    }
}
