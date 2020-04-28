package DianaLaby;




public class Test {
    public static void main(String[] args) {
        int array[][] = new int[4][5]; // чотири рядки і п'ять стовпців
        int min = 1;
        int max = 100;
        int sum = 0;
        int sum1 = 0;
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

        for (int j = 0; j < 5; j++) {
            sum1 += array[3][j];
        }
        System.out.println("Сума елементів останньої строки =" + sum1);
    }
}

