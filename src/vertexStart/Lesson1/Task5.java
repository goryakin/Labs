/*
5. Ввести ціле двозначне число. Вивести першу цифру на екран.
 */
package vertexStart.Lesson1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введіть ціле двозначне число:");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = x/10;
        System.out.println("Перша цифра числа: "+y);
    }
}
