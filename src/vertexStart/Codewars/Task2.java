/*
вводятся три положительных числа в возрастающей последовательности: a, b, c.
Вернуть наибольше наибольше число после операциий (+,(),*)
 */

package vertexStart.Codewars;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int x = maxNumber();
        System.out.println("Наибольшее число: " +x);
    }

    public static int maxNumber() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите три числа: a, b, c");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        int x1 = a*(b+c);
        int x2 = a+b*c;
        int x3 = a*b*c;
        int x4 = (a+b)*c;
        System.out.println("x1= "+x1);
        System.out.println("x2= "+x2);
        System.out.println("x3= "+x3);
        System.out.println("x4= "+x4);

        int x=0;
        for (int i = x1; i <=x4 ; i++) {
            if (x1>x2) {
                x=x1;
                }
            else {
                x=x2;
            }
            if (x2>x3) {
                x=x2;
            }
            else {
                x=x3;
            }
            if(x3>x4) {
                x=x3;
            }
            else {
                x=x4;
            }
        }
        return x;
    }
}
