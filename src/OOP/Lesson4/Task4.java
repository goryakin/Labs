///*
//Задача 4
//=======================
//Створити колекцію (Set) з 5 випадкових чисел від 0 до 50 і вивести її в консоль.
//Створити метод reverse, який приймє на вхід колекцію і змінює порядок її елементів на протилежний.
//Наприклад, з колекції:
//17 22 4 0 7
//Метод має зробити
//7 0 4 22 17
// */
//package OOP.Lesson4;
//import java.util.ArrayList;
//import java.util.LinkedHashSet;
//public class Task4 {
//    public static void main(String[] args) {
//        LinkedHashSet<Integer> nums = new LinkedHashSet<>();
//        for (int i = 0; i < 5; i++) {
//            nums.add((int)(Math.random()*51));
//        }
//        System.out.println(nums);
//        reverse(nums);
//        System.out.println(nums);
//    }
//​    public static void reverse(LinkedHashSet<Integer> set) {
//        ArrayList<Integer> list = new ArrayList<>(set);
//        for (int i = 0; i < list.size(); i++) {
//            list.add(0, list.remove(i));
//        }
//        System.out.println(list);
//        set.clear();
//        set.addAll(list);
//    }
//}