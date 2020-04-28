/*
ЗАДАЧА 1
=======================
Створити колекція HashMap<Integer, String> і додати в неї 10 елементів наступним чином:
* в якості ключа згенерувати випадкове число від 0 до 20
* в якості значення встановити рядочок, що складається із букв "о". Кількість букв "о" рівна ключу.
(Наприклад, якщо ключ 7, то значення буде "ооооооо")
Вивести колекцію в консоль, де кожна пара "ключ - значення" з нового рядочка.
 */
package OOP.Lesson5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap();
        for (int i = 0; i < 10; i++) {
        int number = (int) (Math.random() * 21);
         ArrayList<String> letter = new ArrayList();
         for (int j = 0; j <number ; j++) {
         letter.add("o");
            }
        hashMap.put(number, String.valueOf(letter));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.println("Ключ: " + entry.getKey() + " Значення: "
                    + entry.getValue());
        }
    }
}