/*
Задача 2
-------------------------------------------
Задано текст. Потрібно підрахувати, скільки кожної з букв (якщо такі букви є) у тексті. Вивести результат у порядку алфавіту.
Наприклад:
Текст: "І Архімед, і Галілей"
Вивід:
а - 2
г - 1
д - 1
е - 2
і - 4
й - 1
л - 2
м - 1
р - 1
х - 1
 */
package OOP.Lesson6;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        String text = "І Архімед, і Галілей";
        text = text.replace(",", "");
        text = text.replace(" ", "");
        String word = text.toLowerCase(); // заменяем все буквы на маленькие
        System.out.println(word);
        char[] rezult = word.toCharArray(); //перевел слово в массив символов
//      Arrays.sort(rezult); //отсортировал буквы по алфавиту
        System.out.println(rezult);
        TreeMap<Character, Integer> rezultMap = new TreeMap();
//      HashMap<Character, Integer> rezultMap = new HashMap<>();
        for (char i : rezult) {
            if (rezultMap.containsKey(i)) {
                rezultMap.put(i, rezultMap.get(i)+1);
            } else {
                rezultMap.put(i, 1);
            }
        }
        System.out.println(rezultMap);
    }
}