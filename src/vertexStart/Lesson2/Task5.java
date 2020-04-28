//5. Зчитати з клавіатури число k. Вивести в ряд k зірочок.
package vertexStart.Lesson2;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите число k");
        int k = scanner.nextInt();
        for (int i = 1; i <=k ; i++) {
            char z = '*';
        System.out.print(z);
    }
}
}
