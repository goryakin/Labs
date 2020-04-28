/*
ЗАВДАННЯ 3
----------------------------------------
Створити метод, який приймає на вхід ім'я папки. Метод повинен рекурсивно видалити папку (папку і весь її вміст).
 */
package OOP.Lesson8;
import java.io.File;
public class Task3 {
    public static void main(String[] args) throws Exception {
        String folder;
        recursiveDelete(new File(folder = "src/OOP/Lesson8/ForDelete"));
    }
        private static void recursiveDelete(File file) {
            if (!file.exists())
                return;
            if (file.isDirectory()) {
                for (File f : file.listFiles()) {
                    recursiveDelete(f);
                }
            }
            file.delete();
            System.out.println("Видалена папка: " + file.getAbsolutePath());
        }
}


