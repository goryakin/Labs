/*проверить число, отрицательное или нет, если отрицательное то ретурн отрицательное, если положительное,
то положительное - ретирун отрицательное, если ,0, то ретурн - не проверяем
*/
package vertexStart.Codewars;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a = newNumber();
        System.out.println(a);

    }

    public static int newNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше или меньше 0:");
        int a = scanner.nextInt();
        if (a<0){
            return a;
        }
        if (a==0){
            return newNumber();
        }
        if (a>0){
           a=-a;
        }
        return a;
    }
}


