/*
1. (Таблиця 1) Ініціалізуйте одномірний масив з N випадкових елементів типу Т з проміжку [a; b]. Покажіть на екрані потрібні елементи або обчислену величину відповідно до варіанту.
Сценарій:
- ініціалізація масиву
- відображення масиву на екрані
- відображення на екрані потрібних елементів або обчислення і відображення потрібної величини
 */
package DianaLaby;
public class LabaArrayTask1 {
    public static void main(String[] args) {
        int[] array = new int[14];
        int min = 20;
        int max = 35;
        int counter =0; //лічильник для умови
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * (max - min + 1) + min)); //заповнення масиву iз заданого проміжку
            if ( array [i] >30 & array [i] %3==0) {
                counter++;
            }
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        System.out.println("Кількість елементів, які діляться на 3 і >30 : "+counter);
        }
    }

