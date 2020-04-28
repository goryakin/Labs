/*
3. Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99], виведіть його на екран у рядок.
Визначити і вивести на екран повідомлення про те, чи є масив строго зростаючою послідовністю
кожен наступний елемент більший за попередній).
 */
package vertexStart.Lesson3;
public class Task3 {
    public static void main(String[] args) {
        int min=10;
        int max=99;
        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(array[i]+ ", ");
        }
        boolean growing = true;
        for (int i = 1; i <4 ; i++) {
            if (array[i]<=array[i-1]) {
                growing=false;
                break;
            }
        }
        if (growing) {
            System.out.println("Массив возрастающий");
        }
        else {
            System.out.println("Массив не возрастающий");
        }
    }
}
