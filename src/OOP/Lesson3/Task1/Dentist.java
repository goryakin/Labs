/*
Створити клас Стоматолог, який розширює клас Хірурга.
Стоматолог перед тим, як лікувати, має перевірити, чи орган операції зуб. Якщо не зуб - операцію здійснити неможливо.
 */
package OOP.Lesson3.Task1;

public class Dentist extends Surgeon {

    String organ;

    public void checkOrgan() {
        if (organ.equals("Tooth")) {
            System.out.println("Орган зуб - операція можлива");
        }
        else {
            System.out.println("Орган не зуб - операція не можлива");
        }
    }

    @Override
    public void doctor(String organ) {

    }
}
