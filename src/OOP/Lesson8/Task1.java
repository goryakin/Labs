/*
ЗАВДАННЯ 1:
-----------------------------------------
Знайти та вивести при слів тексту, для яких остання буква одного слова
збігається з першою літерою наступного слова. Текст знаходиться в окремому файлі.
Наприклад, якщо у файлі текст:
яблуко мандарин зелень огірок диня рис остеохондроз
Має вивести
яблуко - огірок
яблуко - остеохондроз
диня - яблуко
остеохондроз - зелень
 */
package OOP.Lesson8;
import java.io.FileReader;
import java.util.Scanner;
public class Task1 {
        public static void main(String[] args)throws Exception {
            FileReader fr = new FileReader("src/OOP/Lesson8/task1.txt");
            Scanner scan = new Scanner(fr);
            String text = scan.nextLine();
            System.out.println(text);
            String[] words = text.split(" ");
                for (int i = 0; i < words.length-1; i++) {
                if((words[i].charAt(words[i].length()-1)) == (words[i+1].charAt(0)))
                System.out.println(words[i] + " - " + words[i + 1]);
                fr.close();
              }
         }
    }

