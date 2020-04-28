/*
7. Ввести чотиризначне число. Вивести першу цифру, другу цифру, третю цифру і четверту цифру в консоль.
 Кожна з нового рядка.
 */
package vertexStart.Lesson1;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введіть чотиризначне число:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        x=x/1000;
        System.out.println("Перша цифра: "+x);
        System.out.println("Друга цифра: ");
        System.out.println("Третя цифра: ");
        System.out.println("Четверта цифра: ");

    }
}