/*
Задача 2
======================
Створити колекцію з елементами Integer. Додати в неї 200 випадкових чисел в діапазоні від -33 до 33 включно.
Створити метод lower, який приймає на вхід число та початкову колекцію і повертає нову колекцію
з елементів початкової, які менші за переданий.
Наприклад, якщо колекція [-2, 12, 5, 4, 7], а передане число 5, то повернути колекцію [-2, 4]
 */
package OOP.Lesson4;
import java.util.ArrayList;
public class Task2 {
    public static void main(String[] args) {
        int number = ((int) (Math.random() * 67-33));
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i <200 ; i++) {
            boolean add = list.add((int) (Math.random() * 67-33));
        }
        System.out.println("Початкова колекція: " +list);
        System.out.println("Кількість елементів початкової колекції: "+list.size());
        ArrayList<Integer> newList = lower (number,list);
        System.out.println("Випадкове передане число: "+number);
        System.out.println("Нова колекція: "+newList);
        System.out.println("Кількість елементів нової колекції: "+newList.size());
    }
    public static ArrayList<Integer> lower(int number, ArrayList <Integer>list) {

        ArrayList<Integer> newList = new ArrayList();
           for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) <number)
           newList.add(list.get(i));
        }
           return newList;
    }
}

