/*
4. Створіть масив з 12 випадкових цілих чисел з відрізка [-15; 15].
Визначте який елемент є в цьому масиві максимальним і виведіть індекс його останнього входження в масив.
Наприклад, при згенерованому масиві [1, 2, 3, 4, 12, 5, 6, 7, 8, 9, 12, 10] має бути:
масимальний елемент 12, індекс останнього входження 10.
 */
package vertexStart.Lesson3;
public class Task4 {
    public static void main(String[] args) {
        int min=-15;
        int max=15;
        int maxNumber = -16;
        int lastIndexShow=0;
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(array[i] + ", ");
            if (maxNumber <= array [i]) {
                maxNumber = array [i];
                lastIndexShow =i;
            }
        }
        System.out.println("Максимальное число "+maxNumber + ", его индекс "+lastIndexShow);
    }
}
