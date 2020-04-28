/*
Створити абстрактний клас Хірург, який має
- масив інструментів
- метод "Оперувати", який на вхід приймає інструмент для операції. Якщо у лікаря є такий інструмент -
операція успішна, якщо немає - операцію зробити не можна.
 */
package OOP.Lesson3.Task1;

public abstract class Surgeon implements Doctorable {
    String[] tools;

    public static void operate(String[] tools) {
        for (int i = 0; i < tools.length; i++) {
            //for (String i:tools)
            if (tools[i].equals(tools)) {
                System.out.println("Операція успіша");
            } else
                System.out.println("Операцію зробити не можна");
        }
    }
}
