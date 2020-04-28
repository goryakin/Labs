/*
Створіть метод, який визначає, скільки грошей отримує працівник в тиждень.
Метод має приймати на вхід мінімум 2 параметри: зарплата за годину, кількість пропрацьованих годин.
Умова:
1) Кожна година після 40 рахується за півтори.
2) Працівник не може працювати більше 60 годин на тиждень.
3) Працівник не може отримувати менше 8 доларів за годину.
 */
package vertexStart.Lesson5;
import java.util.Scanner;
public class Task2_variant1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = inputSalary(scanner);
        double y = inputHour(scanner);
        double z = weekSalary(x,y);

    }
    public static double inputSalary(Scanner scanner) {
        System.out.println("Введите размер заработной платы в час не меньше 8$:");
        double x = scanner.nextDouble();
        if (x >= 8) {
            System.out.println("Заработная плата в час "+x);
            return x;
        } else {
            System.out.println("Размер введенной заработной платы не коректный!");
            scanner.nextLine();
            return inputSalary(scanner);
        }
    }
    public static double inputHour(Scanner scanner) {
        System.out.println("Введите количество отработанных часов в неделю не более 60:");
        double y = scanner.nextDouble();
        if (y <=60) {
            if (y>40 & y<=60) {
                y=40+(y-40)*1.5;
            }
            System.out.println("Отработанных часов в неделю "+y);
            return y;
        } else {
            System.out.println("Количество введеных отработанных часов в неделю не коректно!");
            scanner.nextLine();
            return inputHour(scanner);
        }
    }
    public static double weekSalary(double inputSalary, double inputHour) {
        double z = inputSalary * inputHour;
        System.out.println("Заработная плата за неделю равна " +z);
        return z;
    }
}
