///*
//6. Користувач вводить з клавіатури натуральне число більше 3, яке зберігається в змінну n.
//Якщо користувач ввів не підходяще число, то програма повинна попросити користувача повторно ввести число.
//Створити масив з n випадкових цілих чисел з відрізка [0, n] і вивести його на екран.
//Створити другий масив тільки з парних елементів першого масиву, якщо вони там є, і вивести його на екран.
// */
//package vertexStart.Lesson3;
//import java.util.Scanner;
//public class Task6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите n больше 3: ");
//        int n = scanner.nextInt();
//        if (n <= 3) {
//            System.out.println("Введите повторно подходящее число больше 3");
//        } else {
//            int[] arr = new int[n];
//            int min = 0;
//            int max = n;
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = (int) (Math.random() * (max - min + 1) + min);
//                int evenNumbers = 0;
//                if(arr[i]%2 == 0){
//                    evenNumbers++;
//                    int [] arrEven = new int[evenNumbers];
//                    int j =0; // перемення для индекса второго масссива
//                    for (int i = 0; i < n; i++) {
//                        if(arrEven[i]%2 == 0){
//                            arrEven[j] = arr[i];
//                            j++;
//                        }
//                    }
//                    System.out.print(arrEven [j]+ ", ");
//                }
//                System.out.print(arr[i] + ", ");
//            }
//
//        }
//    }
//}
////проверить 27-ю строчку, ошибка с парными