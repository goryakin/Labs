/*
Задача 2
------------------
У змінній text знаходиться текст. Потрібно: замінити всі найкоротші слова у тексті,
якщо таких декілька, на одне із найдовших. Найдовше слово для заміни обирається
випадковим чином серед всіх слів найбільшої довжини.

ex. "Если Вы запустите данный код, то Вы не увидите следующее выражение"
надо заменить Вы, то, Вы
1. Надо разелить текст
2. Перебрать весь текст и найти самые короткие слова
3. Найти самые длинные слова
4. Рандомом выбрать (через индексы слов) одно слово из самых длинных
5. Выбранным длиным заменить все короткие
 */
package vertexStart.Lesson4;
import java.util.Scanner;
public class Task2 {
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

        int longLength = words[0].length(); //минимальная длина слова
        int indexLongWords =0; //счетчик для новых длинных слов
        for (String word : words) {
            if (word.length() > longLength) {
                longLength = word.length(); //узнали длину самого длинного слова/слов

            }
        }
        for (String word : words) {
            if (word.length() == longLength) {
                indexLongWords ++; //увеличиваем индекс полученных длинных слов в зависимости от колличества
                System.out.println(word+ " "  +indexLongWords) ;

            }
    }
        int shortLength = words[0].length(); //минимальная длина слова
        int indexShortWords =0; //счетчик для новых коротких слов
        for (String word : words) {
            if (word.length() < shortLength) {
                shortLength = word.length();
            }
        }
        for (String word : words) {
            if (word.length() == shortLength) {
                indexShortWords ++; //увеличиваем индекс полученных коротких слов в зависимости от колличества
                System.out.println(word+ " "  +indexShortWords);
            }
        }
    }
}
//      Arrays.sort(words); // сортирует, но если есть загравніе букві то ставит вперед

//      int x;
//       for (String shortWord : words) { //цикл for each для перебора слов
//           if (shortWord.length() == 2) {
//        System.out.println(Arrays.toString(words));
//ArrayList <String> shortWord = new ArrayList<>();
//replace ()
//                ArrayList <String> shortWord = new ArrayList<>(); //сделали произвольный массив/список для помещения кортких слов
//                shortWord.add(word); //довабляем в список все короткие слова
//                System.out.print(Arrays.toString());

 //   Random random = new Random();
//        int index = random.nextInt(indexLongWords);
//        System.out.println(index);
