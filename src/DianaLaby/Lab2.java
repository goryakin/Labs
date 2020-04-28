package DianaLaby;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("Введіть аргумент y");
        Scanner scanner = new Scanner(System.in);
        double y = scanner.nextDouble();
        double h = 5;
        if (y == 0.881765) {
            System.out.println("Недопустимі значення аргументів. Вираз неможливо обчислити");
        }
        else {
        double A = (Math.tan(Math.pow(y, 3) - Math.pow(h, 4)) + Math.pow(h, 2)) / (Math.pow(Math.sin(h), 3) + y);
        System.out.println("Результат= "+ A);
            }
    }
}  