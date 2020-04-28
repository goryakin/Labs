/*
Задача 1
===================
Напишіть метод, який визначає, число просте чи ні
(прості числа діляться націло тільки на 1 і самі на себе, наприклад, 3,7,11...). Виведіть всі прості числа від 1 до 100.
 */
package vertexStart.Lesson5;
public class Task1 {
    public static void main(String[] args) {
        int x = simpleNumber();
    }

    public static int simpleNumber() {
        int x, y;
        for (x = 1; x <= 100; x++) {
            y = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0)
                    y++;
            }
            if (y <= 2) //счетчик колличества делений числа, пока 2 и меньше, то число простое
                System.out.print(x+", ");
        }
        return x;
    }
}
