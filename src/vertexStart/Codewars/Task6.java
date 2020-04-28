/*
Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля.
http://www.itmathrepetitor.ru/prog/zadachi-na-massivy-2/
 */
package vertexStart.Codewars;
public class Task6 {
    public static void main(String[] args) {
        int [] arr = new int [7];
        for (int i = 0; i <arr.length ; i++) {
            if (i%2==0) {
                arr [i] =0;
            }
            else {
                arr [i] =1;
            }
            System.out.print(arr [i]+", ");

        }
    }

}
