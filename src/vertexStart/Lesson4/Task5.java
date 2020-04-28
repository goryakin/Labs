/*
Задача 5
------------------------
Сортувати слова в тексті за алфавітом.

1. Убираем все заглавные
2. Сортируеем
к примеру: "Если Вы запустите данный код, то Вы увидите следующее выражение, а может и нет"
 */
package vertexStart.Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст ");
        String text = sc.nextLine();

        //удаляем знаки препинания и лишние пробелы
        text = text.replace(".", "");
        text = text.replace(",", "");
        text = text.replace(";", "");
        text = text.replace(":", "");
        text = text.replace("!", "");
        text = text.replace("?", "");
        text = text.replace(".", "");
        text = text.replace("/", "");
        text = text.replace("  ", " ");
        text = text.replace(" - ", " ");

        String rezult = text.toLowerCase(); // заменяем все буквы на маленькие (или на большие)

        String[] words = rezult.split(" "); //разделяем текст на слова по признаку пробела
        Arrays.sort(words); //сортируем по алфавиту
        System.out.print("Слова сортированы по алфавиту " +Arrays.toString(words));
    }
}
