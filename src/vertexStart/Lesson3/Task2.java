/*
2. Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5] кожен.
Виведіть масиви на екран в двох окремих рядках.
Порахуйте середнє арифметичне елементів кожного масиву і виведіть, для якого з масивів це значення виявилося більше
(або повідомте, що їхнє середні арифметичні рівні).
 */
package vertexStart.Lesson3;
public class Task2 {
    public static void main(String[] args) {
        int min=0;
        int max=5;
        int[] array1 = new int[5]; //создали пустой массив и указали размерность 5, по умолчнию все елементы 0
        int[] array2 = new int[5]; //создали пустой массив и указали размерность 5, по умолчнию все елементы 0
        int[] arr1 = new int[5]; //создали  массив для заполнения рандомно первого
        int[] arr2 = new int[5]; //создали массив для заполнения рандомно второго

        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * (max - min + 1) + min));
            arr1 [i] = array1 [i];
            System.out.print(+arr1[i]+ ", "); //проверили
                    }
        System.out.println('\n');
        for (int j = 0; j < array2.length; j++) {
            array2[j] = ((int) (Math.random() * (max - min + 1) + min));
            arr2 [j] = array2 [j];
            System.out.print(arr2[j]+ ", "); //проверили
        }
        System.out.println('\n');
        double average1 = 0;
        double average2 = 0;
        for (int i = 0; i < 5; i++) {
            average1 += arr1[i];
            average1/=5;
        }
        for (int j = 0; j < 5; j++) {
            average2 += arr2[j];
            average2 /= 5;
        }
            if(average1 > average2){
                System.out.println("Среднее арифметическое первого массива ("+average1+") больше среднего арифметического "+
                        "второго массива ("+average2+")");
            } else if(average1 < average2){
                System.out.println("Среднее арифметическое первого массива ("+average1+") меньше среднего арифметического "+
                        "второго массива ("+average2+")");
            } else {
                System.out.println("Средние арифметические массивов равны ("+average1+")");
        }
    }
}

