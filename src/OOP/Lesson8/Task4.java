/*
ЗАВДАННЯ 4
---------------------------------------
У наперед заданій папці створити файл structure.txt. Записати у цей файл структуру файлів і папок даної папки. Наприклад:
structure.txt
file11.txt
file12.txt
folder1
|
 - file21.txt
 - file22.txt
 - folder2
   |
    - file31.txt
file13.img
 */
package OOP.Lesson8;
import java.io.File;
import java.io.FileWriter;
public class Task4 {
    public static void main(String[] args) {
        File Folder = null;
        String[] listFiles;

        try {
            Folder = new File("src/OOP/Lesson8/FolderTask4/");
            listFiles = Folder.list();
            for (String path : listFiles) {
                FileWriter fw = new FileWriter("src/OOP/Lesson8/FolderTask4/structure.txt", true);
                fw.write("-" + path +  "\n");

                fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



//String[] list(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
//File[] listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге

