/*
Задача 3
-----------------------
Знайти у тексті найдовше слово/слова і замінити в ньому/в них всі буква "а", "о", "у" на символ "%"
ex. "Если Вы запустите данный код, то Вы не увидите следующее выражение"
 */
package vertexStart.Lesson4;
import java.util.Scanner;
public class Task3 {
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

        String[] words = text.split(" "); //разделяем текст на слова по признаку пробела

        int longLength = words[0].length(); //минимальная длина слова
        for (String word : words) {
            if (word.length() > longLength) {
                longLength = word.length(); //определили длину слова
            }
        }
        for (String word : words) {
            if (word.length() == longLength) {
                word = word.replace("а", "%");
                word = word.replace("о", "%");
                word = word.replace("у", "%");
                System.out.println(word);
            }
           }
     System.out.println(text);
    }
}