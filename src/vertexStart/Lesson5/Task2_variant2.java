package vertexStart.Lesson5;

import java.util.Scanner;

public class Task2_variant2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = inputSalary(scanner);
        double y = inputHour(scanner);
        double z = weekSalary(x, y);
    }
    public static double inputSalary(Scanner scanner) {
        System.out.println("Введите размер заработной платы в час не меньше 8$:");
        if (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            scanner.nextLine();
            return inputLevelSalary(scanner);
        } else {
            System.out.println("Размер введенной заработной платы не коректный!");
            scanner.nextLine();
            return inputSalary(scanner);
        }
    }
    public static double inputLevelSalary(Scanner scanner) {
            double x = scanner.nextDouble();
         System.out.println("Введите повторно размер заработной платы в час не меньше 8$:");
            if (x >= 8) {
                System.out.println("Заработная плата в час " + x);
                return x;
            } else {
                System.out.println("Размер введенной заработной платы не коректный!");
                scanner.nextLine();
                return inputLevelSalary(scanner);
            }
    }
    public static double inputHour (Scanner scanner) {
            System.out.println("Введите количество отработанных часов не более 60:");
            if (scanner.hasNextDouble()) {
                double y = scanner.nextDouble();
                scanner.nextLine();
                return inputLevelHour(scanner);
            } else {
                System.out.println("Количество отработанных часов не коректно!");
                scanner.nextLine();
                return inputSalary(scanner);
            }
        }
    public static double inputLevelHour(Scanner scanner) {
        System.out.println("Введите повторно количество отработанных часов в неделю не более 60:");
        double y = scanner.nextDouble();
        if (y <= 60) {
            if (y > 40 & y <= 60) {
                y = 40 + (y - 40) * 1.5;
            }
            System.out.println("Отработанных часов в неделю " + y);
            return y;
        } else {
            System.out.println("Размер введеных отработанных часов в неделю не коректный!");
            scanner.nextLine();
            return inputHour(scanner);
        }
    }
    public static double weekSalary(double inputSalary, double inputHour) {
        double z = inputSalary * inputHour;
        System.out.println("Заработная плата за неделю равна " + z);
        return z;
    }
}
