/*
10. Зчитати з консолі число m. Вивести число під номером m, яке ділиться на 3 або на 4.
Наприклад: m = 7
Числа, що діляться на 3 або на 4:
3, 4, 6, 8, 12, 15, 16, 18, 20, 21...
Під номером 7 число 16.
 */
package vertexStart.Lesson2;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число m");
        int m = scanner.nextInt();
        int shetchik = 0; //m - это порядковый номер счетчика
        for (int chislo = 0; chislo <=100; chislo++) {
            if (chislo % 3 == 0 || chislo % 4 == 0)
            System.out.println(chislo + " " );
   //   shetchik = shetchik + 1;
       //if (shetchik == m)
    //   break;
    //   System.out.println("Под номером " + m + " число " + chislo);
        }
    }
}
