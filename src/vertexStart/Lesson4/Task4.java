/*
Задача 4
------------------------
Перетворити текст у camel case, тобто пробіли між словами видалити, а першу букву наступного слова
 зробити великою. Для прикладу: Початковий рядок - "Я любю мову Java"
На виході - "ЯЛюблюМовуJava"
 */
package vertexStart.Lesson4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст ");
        String text = sc.nextLine();

        char[] chars = text.toCharArray();

        chars[0] = Character.toUpperCase(chars[0]);
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i + 1] = Character.toUpperCase(chars[i + 1]);
            }
        }
        text = new String(chars);
        text = text.replace(" ", "");
        System.out.println(text);
    }
}