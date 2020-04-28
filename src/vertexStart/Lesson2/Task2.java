//2. Зчитати з консолі 2 числа. Вивести в консоль більше із них.

package vertexStart.Lesson2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x = scanner.nextInt();
        System.out.println("Введите второе число");
        int y = scanner.nextInt();
        if (x>y) {
            System.out.println("Большее число "+x);
        }
       else {
           System.out.println("Большее число "+y);
       }
    }
}
