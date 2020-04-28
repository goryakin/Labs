/*
6. Ввести дробове число. Вивести першу цифру після коми на екран
 */
package vertexStart.Lesson1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введіть дробове число:");
        Scanner scan = new Scanner(System.in);
        float x = scan.nextFloat();
        int y = (int)x;
        float z= (x-y)*10;
        System.out.println("Перша цифра після коми: "+ (int)z);
    }
}
