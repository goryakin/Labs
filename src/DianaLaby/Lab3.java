package DianaLaby;

import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        System.out.println("Введіть аргумент y");
        Scanner scanner = new Scanner(System.in);
        double y = scanner.nextDouble();
        double h = 5;
        double step;
        int N = 3;
        step = 0.5 + N / 20.0; // крок

        if (y == 0.881765 || y < -10 - 2.5 * N || y > 5+1.2*N) System.out.println("Недопустимі значення аргументів. Вираз неможливо обчислити");
        else {
        while (y > -10 - 2.5 * N)
        {
                double A = (Math.tan(Math.pow(y, 3) - Math.pow(h, 4)) + Math.pow(h, 2)) / (Math.pow(Math.sin(h), 3) + y);
                System.out.println("y = " + y);
                System.out.println("Результат = " + A);
                if (y >= 5+1.2*N) // надо чтобы выбивало до того, как у=8.6
                    break;
                y = y + step;
            }

            }
        }
    }
