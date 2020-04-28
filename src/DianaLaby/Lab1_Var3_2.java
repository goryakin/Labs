package DianaLaby;

import java.util.Scanner;

public class Lab1_Var3_2 {
    public static void main(String[] args) {
        System.out.println("Введіть аргумент y та h");
        Scanner scanner = new Scanner(System.in);
        double y = scanner.nextInt();
        double h = scanner.nextInt();
        double A = (Math.tan(Math.pow(y, 3) - Math.pow(h, 4)) + Math.pow(h, 2)) / (Math.pow(Math.sin(h), 3) + y);
        System.out.println("Результат= "+ A);
    }
}
