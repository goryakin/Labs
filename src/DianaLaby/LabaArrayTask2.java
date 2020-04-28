/*
2. (Таблиця 2) Згенеруйте 2-мірний масив розміром n x m випадковими числами здовільного проміжку.
 Перетворіть масив відповідно до завдання у стовпці "Що змінити" та обчисліть величину відповідно
 до завдання у стовпці "Що знайти". Сценарій:
- генерується масив
- відображається на екрані
- модифікується
- відображається на екрані змінений масив
- обчислюється і відображається на екрані відповідна величина
 */
package DianaLaby;

public class LabaArrayTask2 {
    public static void main(String[] args) {
        int array[][] = new int[4][5]; // чотири рядки і п'ять стовпців
        int min = 1;
        int max = 100;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * (max - min + 1) + min)); //заповнення масиву iз заданого проміжку
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i][4];
        }
        System.out.println("Сума елементів останнього стовпця =" + sum);

    }
}


//        for (int i = 0; i <array.length-1; i++) {
//            for (int j = i + 1; j <array.length; j++) {
//                if (array[0][i] < array[0][j]) {
//                    int temp = array[0][i];
//                    array[0][i] = array[0][j];
//                    array[0][j] = temp;
//                    System.out.print(array[i][j] + "\t");
//                }
//      //              System.out.println();






//      Arrays.sort(array);
//        System.out.println(Arrays.toString(array));