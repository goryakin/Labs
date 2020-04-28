/*
Створити клас Galeon, який розширює клас MilitaryShip.
Клас Galeon додатково має
- поле country, що зберігає країну-виробника корабля
Galeon вступає в бій тільки з іншими галеонами. В іншому випадку Galeon відразу перемагає.

 */
package OOP.Lesson3.Task2;

public class Galeon extends MilitaryShip {
    String country;

    @Override
    public void sail(int speed) {

    }

    @Override
    public void turn(String left, String right, int degreeTurn) {

    }
}
