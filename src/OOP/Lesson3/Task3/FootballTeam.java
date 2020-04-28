/*
Створити клас ФутбольнаКоманда.
У класі є необхідна для гри кількість гравців. Для футболу це 11. Кількість футболістів не може бути більше цього числа.
У ФутбольнаКоманда збергігається список із футболістів (це може бути масив, але краще гляньте ArrayList
і спробуйте його застосувати https://vertex-academy.com/tutorials/ru/arraylist-v-java/).
-------------------------------------------------------
 */
package OOP.Lesson3.Task3;

import java.util.ArrayList;

public class FootballTeam extends Footballer {
    ArrayList<String> FootballTeam = new ArrayList(11);

    public static int size() {
        return 11;
    }
}
