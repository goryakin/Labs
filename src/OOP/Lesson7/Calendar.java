///*
//--------------------------
//Створити клас Календар, який складається з Років, Місяців та Днів. Календар надає можливість:
//1) задати для певної дати (наприкад, для 11.02.2020) певну Подію
//2) переглянути всі події на певну дату
//Кожна подія має заголовок, текст, час дня, коли ця подія починається, і скільки вона триває.
//Якщо якийсь із параметрів події неправильний, згенерувати виключення IncorrectEventException.
// */
//package OOP.Lesson7;
//public class Calendar {
//    static String title;
//    static String description;
//    static int timeDay;
//    static int longTime;
//    public Calendar(String title, String description, int timeDay, int longTime) {
//        this.title = title;
//        this.description = description;
//        this.timeDay = timeDay;
//        this.longTime = longTime;
//    }
//    public static <IncorrectEventException extends Throwable> void main(String[] args) {
//        int year = 2010;
//        int month = 02;
//        int day = 11;
//        try {
//            if (day == 11 & month == 02 & year == 2020)
//                System.out.println("Ура - сьогодні вихідний");
//        } catch (IncorrectEventException ex) {
//            System.out.println("Подія на вказану дату відсутня");
//        } finally {
//            System.out.println("Виберіть коректну дату");
//        }
//        System.out.println("Подія на вказну дату:" +title, +description, +timeDay, +longTime );
//
//    }
//
//}
