//пока не получилось сдвинуть влево

package vertexStart.Lesson5;

public class Task3_Left {
    public static void main(String[] args) {
        int size = 2;
        int  [] array1 = {1, 3, 4, 32, 33, 34, 35}; //Массив, который будем сдвигать
        int [] b = new int[array1.length + size]; //временный массив
        System.out.print("Массив до сдвига: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
            b[i + size] = array1[i];
            array1[i] = b[i];
        }
        System.out.println();
        int n=0;
        for (int i = 0; i <size; i++) {
         //   for (int i = 0; i <size; i++) {
            b[i] = b [b.length-size+n];
            n++;
            array1[i] = b[i];

        }
        System.out.print("Массив после сдвига: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
