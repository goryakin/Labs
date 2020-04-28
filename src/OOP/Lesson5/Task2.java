/*
ЗАДАЧА 2
=======================
Створити метод getKeysByValue, який приймає на вхід Map<Integer, String> та значення для пошуку. Метод повертає список із ключів, у яких value дорівнює переданому значенню.
Наприклад, для мапи
1 - "a"
2 - "b"
3 - "a"
4 - "c"
При передаванні значення для пошуку "а" має повернутися колекція
[1,3]
 */
package OOP.Lesson5;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap();
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "a");
        hashMap.put(4, "c");
        for (Map.Entry entry : hashMap.entrySet()) {
            for (int i = 0; i < hashMap.size(); i++) {
             if (hashMap.containsValue("a")) ;
     //        if (entry.getValue()=="a");
            }
            System.out.println(entry.getKey());
        }
    }
}