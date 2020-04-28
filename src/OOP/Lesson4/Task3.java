/*
Задача 3
=========================
Створити колекцію (List) з 30 випадкових чисел від -20 до 20.
Написати метод, який приймає на вхід колекцію та ціле число для пошуку.
Метод повертає кількість входжень числа у колекцію.
 */
package OOP.Lesson4;
import java.util.ArrayList;
public class Task3 {
    public static void main(String[] args) {
        int number = ((int) (Math.random() * 40 - 20));
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            boolean add = list.add((int) (Math.random() * 40 - 20));
        }
        System.out.println("Сгенерована колекція: " + list);
        System.out.println("Кількість елементів колекції: " + list.size());
        System.out.println("Випадкове передане число: " + number);
        int numberEntries = numberEntries(number, list);
        System.out.println("Кількість входжень числа у колекцію: "+numberEntries);
    }
    private static int numberEntries(int number, ArrayList<Integer> list) {
        int numberEntries = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number)
                numberEntries++;
        }
        return numberEntries;
    }
}
