/*
Задача 1
-----------------------
Створити клас потоку, який на вхід приймає ЧИСЛО. В тілі потоку рахується квадрат
 переданого числа і виводиться в консоль у форматі "ЧИСЛО * ЧИСЛО = КВАДРАТ_ЧИСЛА".
У main створити 10 потоків, передати їм числа від 1 до 10 і запустити.
 */

package OOP.Lesson9;
public class MyThread extends Thread {

    int number;

    public MyThread(int number) {
        this.number = number;

    }

    @Override
      public void run() {
        int rezult = number*number;
        System.out.println(rezult +this.getName());
 }
}


