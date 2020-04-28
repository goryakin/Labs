/*
У main:
1. Створити метод penalty, який приймає на вхід 5 гравців для пробивання пенальті. Метод:
- Кожен гравець має зробити удар.
- Вивести в консоль результат серії пенальті (скільки забили, скільки промазали).
2. Створити футбольну команду. Вибрати з неї 5 гравців і викликати з ними метод penalty.
  */
package OOP.Lesson3.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();
        ArrayList<String> footballTeam = team.FootballTeam;
    //    int penalty = penalty();
        team.beatGoal();
    }

    public static void penalty (String Петя, String Вася, String Коля, String Саша, String Паша) {
        for (int i = 0; i < FootballTeam.size(); i++) {
//???
        }
       // return penalty()
   }

}

