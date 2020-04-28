/*
Задача 5
=======================
Створити колекцію (List) з 10 випадкових чисел від 0 до 100. Вивести її в консоль.
Написати метод shuffle, який приймає на вхід колекцію та число n.
Метод має випадковим чином переставляти елементи в колекції. Кількість обмінів - число n.
 */
package OOP.Lesson4;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i <10 ; i++) {
            boolean add = list.add((int) (Math.random() * 100));
        }
        System.out.println(list);
        System.out.println("Кількість елементів: "+list.size());
    }
}

