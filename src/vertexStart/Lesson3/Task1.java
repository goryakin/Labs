/*
1. Створити масив на 20 елементів. Заповнити його випадковими цілии числами в діапазоні [-25,25].
 Замінити всі непарні елементи масива на 0. Вивести новий масив на екран
 */
package vertexStart.Lesson3;
public class Task1 {
    public static void main(String[] args) {
        int min=-25;
        int max=25;
        int[] array1 = new int[20]; //создали пустой массив и указали размерность 20, по умолчнию все елементы 0
        int[] array2 = new int[20]; //создали второй массив для заполнения рандомно
        int[] array3 = new int[20]; //создали третий массивґ, для внесения результа

        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * (max-min+1) + min)); //25 -(-25)+1)+(-25)=51-25
            array2[i] = array1[i]; //заполнили массив 2 случайными числами из первого массива 
        //   System.out.println(array2[i]); //проверили

            for (int j = 0; j < array2.length; j++) {
                if (array2[j]%2==0) {
                array3 [j] = array2[j];
                }
                else {
                    array3 [j] =0;
                }
                System.out.print(array3[j]+ ", ");
                }
        }
    }
}

//проверить, маассив выводиться несколько раз