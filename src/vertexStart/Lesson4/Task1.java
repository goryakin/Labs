/*
Задача 1
--------------------
З консолі вводиться число m. Потрібно видалити з тексту всі слова довжини m.
 */
package vertexStart.Lesson4;
import java.util.Scanner;
public class Task1 {
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

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чило m: ");
        int m = scanner.nextInt();

        for (String word : words) { //цикл for each для перебора слов
            if (word.length() != m) {
                System.out.print(word+" ");
            }
        }
    }
}


