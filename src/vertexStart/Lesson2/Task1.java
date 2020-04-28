/*
1. Зчитати з консолі число. Визначити:
    1) Це цифра (0-9) чи число;
    2) Це додатнє, від'ємне чи 0
   Вивести в консоль результат перевірки (наприклад, "Ви ввели додатню цифру 6" або "Ви ввели від'ємне число 42").
 */
package vertexStart.Lesson2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число или цифру со знаком минус или плюс: ");
        int x = scanner.nextInt();
        if (x<-9 | x>9){
            System.out.print("Вы ввели ЧИСЛО: "+x);
        }
        else  {
            System.out.print("Вы ввели ЦИФРУ: " + x);
        }
        if (0<x) {
            System.out.println(". Значение положительное");
        }
        else if (x<0) {
            System.out.println(". Значение отрицательное ");
        }
        else {
            System.out.println();
        }
    }
}

