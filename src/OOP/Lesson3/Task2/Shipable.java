/*
Задача 2
-------------------------
Створити інтерфейс Ship. Даний інтерфейс має методи
- void sail(), який приймає на вхід швидкість
- void turn(), який приймає на вхід бік, в який потрібно повернути (ліво, право) та градус повороту.
 */
package OOP.Lesson3.Task2;

public interface Shipable {
 public void sail (int speed);
 public void turn (String left, String right, int degreeTurn);
 }

