/*
4. Ввести ціну товару (dоulе) і суму ваших грошей (dоule). Визначити, яку
цілу кількість товарів можна купити на ваші гроші і яка буде здача.
 */
package vertexStart.Lesson1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введіть сумму вашиш грошей:");
        Scanner scanM = new Scanner(System.in);
        double money = scanM.nextDouble();
        System.out.println("Введіть ціну товару:");
        Scanner scanP = new Scanner(System.in);
        double price = scanP.nextDouble();
        int x = (int) (money/price);
        System.out.println("Ви можете купити "+x+" одиниць товару");
        float y = (float) (money - x*price);
        System.out.println("Ваша здача "+y);
    }
}
