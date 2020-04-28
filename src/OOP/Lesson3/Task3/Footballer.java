/*
Створити клас Футболіст.
У кожного футболіста є поля:
- Ім'я
- Номер
- Позиція (голкіпер/захисник/півзахисник/нападник)
- Сила удару (число від 0 до 10)
Ім'я, номер та позиція задаються при створенні гравця. Сила удару генерується випадковим чином.
У кожного футболіста є методи:
- Вдарити по воротах. Даний метод:
    1) генерує випадкове число удачі від 0 до 50
    2) формує число вміння на основі сили удару від 0 до 50 (сила удару 0 - число 0, сила удару 10 - число 50)
    3) додає число удачі до числа вміння. Якщо утворене число більше 51 включно - метод поверає "Гол", інакше метод повертає "Промах"
-------------------------------------------------------
Створити клас ФутбольнаКоманда.
У класі є необхідна для гри кількість гравців. Для футболу це 11. Кількість футболістів не може бути більше цього числа.
У ФутбольнаКоманда збергігається список із футболістів (це може бути масив, але краще гляньте ArrayList
і спробуйте його застосувати https://vertex-academy.com/tutorials/ru/arraylist-v-java/).
-------------------------------------------------------
У main:
1. Створити метод penalty, який приймає на вхід 5 гравців для пробивання пенальті. Метод:
- Кожен гравець має зробити удар.
- Вивести в консоль результат серії пенальті (скільки забили, скільки промазали).
2. Створити футбольну команду. Вибрати з неї 5 гравців і викликати з ними метод penalty.
 */
package OOP.Lesson3.Task3;

public class Footballer {
    String name;
    int number;
    String position;
    int powerBeat = powerBeat(); //сила удару
    int beatGoal = beatGoal(); // вдарити по воротах

    public static int powerBeat() {
        int powerBeat = (int) (Math.random() * 11);
        System.out.println("Сила удару гравця: " + powerBeat);
        return powerBeat;
    }

    public static int beatGoal() {
        int numberLuck = (int) (Math.random() * 51);
        System.out.println("Випадкове число удачі: " + numberLuck);
        int numberSkills = powerBeat()*5;
        System.out.println("Число вміння: "+numberSkills);
        int beatGoal = numberLuck+numberSkills;
        if ( beatGoal >=51){
            System.out.println("Гол! "+ "Сформоване число:"+beatGoal);
        }
        else {
            System.out.println("Промахнувся! "+ "Сформоване число:"+beatGoal);
        }
        return beatGoal;
    }
}
