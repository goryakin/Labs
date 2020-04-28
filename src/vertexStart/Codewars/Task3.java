/*
Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
 */
package vertexStart.Codewars;


public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        int min = 1;
        int max = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * (max - min + 1) + min));
            System.out.print(array [i]+ ", ");
            }
        int maxNumber = array[0];
        int minNumber = array[0];
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            if(maxNumber < array[i])
                maxNumber = array[i];
            if(minNumber > array[i])
                minNumber = array[i];
            average += array[i]/array.length;
        }
        System.out.println();
        System.out.println("Максимальное число = " + maxNumber);
        System.out.println("Минимальное число = " + minNumber);
        System.out.println("Среднее значение = " + average);
    }
}

