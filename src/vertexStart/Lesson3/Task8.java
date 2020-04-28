/*
8. Зчитати з клавіатури число n. Вивести в консоль порожній квадрат з діагоналлю. Для прикладу, при n=6:
* * * * * *
* *       *
*   *     *
*     *   *
*       * *
* * * * * *
 */
package vertexStart.Lesson3;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length-1 ; j++) {
                System.out.print(" *");

            }
            System.out.println(" 0");

        }
    }
}
//доделать