/*
Задача 3
==================
Написати метод, який циклічно зсовує масив вправо або вліво на вказане число позицій.
Зсув також повинен бути кільцевим, тобто ті елементи, які йдуть вправо або вліво за межі масиву,
повинні додаватися з іншого його кінця.
Наприклад, дано масив:
1 2 3 4 5 6
Кільцевий зсув вправо на 2 одиниці:
5 6 1 2 3 4
1.
 */

package vertexStart.Lesson5;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите - если сдвиг влево, + еcли свдиг вправо");
        char shift = scanner.next().charAt(0);
        if (shift=='+') {
        int[] array = shiftRighr();
    }
//        int [] arr = shiftLeft ();


    }
    public static int [] shiftRighr () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива m для сдвига вправо");
        int m = scanner.nextInt();
        int[] array1 = new int[m];
        System.out.println("Введите размер сдвига");
        int size = scanner.nextInt();

        System.out.println("Введите диапазон чисел массива от min, до max ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (max - min + 1) + min);
     //       System.out.print(array1[i] + ", ");
        }

        int [] b = new int[array1.length + size]; //временный массив
        System.out.print("Массив до сдвига: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
            b[i + size] = array1[i];
            array1[i] = b[i];
        }
        System.out.println();
        int n=0;
        for (int i = 0; i <size; i++) {
            b[i] = b [b.length-size+n];
            n++;
            array1[i] = b[i];

        }
        System.out.print("Массив после сдвига: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();

        return array1;
    }
    public static int [] shiftLeft() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива m для сдвига влево  ");
        int m = scanner.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Введите размер сдвига");
        int size = scanner.nextInt();

        System.out.println("Введите диапазон чисел массива от min, до max ");
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * (max - min + 1) + min);
            //       System.out.print(array1[i] + ", ");
        }

        int [] b = new int[arr1.length + size]; //временный массив
        System.out.print("Массив до сдвига: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
            b[i] = arr1[i];
            arr1[i] = b[i];
        }
        System.out.println();
        int n=0;
        for (int i = arr1.length-size; i <arr1.length; i++) {
            b[i] = b [b.length-size+n];
            n++;
            arr1[i] = b[i+size];

        }
        System.out.print("Массив после сдвига: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        return arr1;
    }

  }
