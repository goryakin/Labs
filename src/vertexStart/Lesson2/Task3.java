//3. Зчитати з консолі 2 числа у 2 змінні. Обміняти місцями значення змінних і вивести в косоль.
package vertexStart.Lesson2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число x");
        int x = scanner.nextInt();
        System.out.println("Введите число y");
        int y = scanner.nextInt();
        System.out.println("Упс. Мы поменяли значения x и y местами");
        System.out.println("x="+y);
        System.out.println("y="+(y=x));
    }
}
