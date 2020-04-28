/*
Задача 1
=======================
Створити колекцію з елементами Integer. Додати в неї 200 випадкових чисел в діапазоні від 0 до 100 включно.
Видалити із даної колекції дублікати.
 */
package OOP.Lesson4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        for (int i = 0; i <200 ; i++) {
            boolean add = list.add((int) (Math.random() * 101));
        }
        System.out.println(list);
        System.out.println("Кількість елементів: "+list.size());
        Set<Integer> noDublicate = new HashSet<Integer>(list);
        System.out.println(noDublicate);
        System.out.println("Кількість елементів,без дублікатів : "+noDublicate.size());
    }
}
