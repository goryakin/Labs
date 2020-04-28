/*
ЗАВДАННЯ 2
----------------------------------------
Файл phone-book.txt зберігає інформацію про телефони та їх власників. Наприклад:
6734004040 - Андрій
9976006060 - Катерина
Зчитати з консолі числа m і n.
Вивести в файл filtered-phone-book.txt записи, телефон яких починається на цифру з діапазону від m до n.
 */
package OOP.Lesson8;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws Exception {

        System.out.println("Введіть числа m та n з діапазону від 0 до 9");
        Scanner scaner = new Scanner(System.in);
        int m = scaner.nextInt();
        int n = scaner.nextInt();
        int number = (int) (Math.random() * (n - m) + m);
        System.out.println("Сгенероване випадкове число:" + number);

        FileReader fr = new FileReader("src/OOP/Lesson8/phone-book.txt");
        Scanner scan = new Scanner(fr);
        System.out.println("Перелік власників телефонних номерів із файлу phone-book.txt:");
        while (scan.hasNext())
        System.out.println(scan.nextLine());
        fr.close();

        HashMap<Integer, String> myMap = new HashMap<Integer, String>(Integer.parseInt(scan.next()));
           for (Map.Entry entry : myMap.entrySet()) {
            if ((char)number==myMap.get(scan.nextInt()).charAt(0));
               myMap.put(scan.nextInt(), scan.next());
               System.out.println("HashMap"+myMap);
        }

        FileWriter fw = new FileWriter("src/OOP/Lesson8/filtered-phone-book.txt", true);
       fw.write(String.valueOf(myMap));
        fw.write("Записалось?");
        fw.close();

    }
}
