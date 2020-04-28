package DianaLaby;

import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args) {
       System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String reverse = new StringBuffer(s).reverse().toString();
        System.out.println("\nСтрока до реверса: " + s);
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
    }
}

