/*
/*
Задача 1
================
Створити клас Car, який має
- поле number (номерний знак автомобіля)
- поле color (колір автомобіля)
- поле humanCount (кількість людей в автомобілі)
- поле maxHumanCount (максимальна кількість людей в авто)
- поле state (стан автомобіля: стоїть з вимкненим двигуном, стоїть заведене чи їде)
- метод printNumber(), який виводить в консоль номер автомобіля, колір та кількість людей в авто.
- метод changeHumanCount(), який генерує випадкове число в діапазоні [-5, 5]. Якщо число
 від'ємне - відповідна кількість людей з авто виходять,
 якщо додатнє - заходять. Максимальне число людей не має перевищувати maxHumanCount і не має бути менше 0.
- метод changeState(String newState), який змінює state із поточного на переданий. Перед тим,
 як змінити стан, потрібно переконатися, що це можливо
 (авто не може відразу поїхати із стану "стоїть із вимкненим двигуном". Спочатку його треба завести).

Всі поля приватні. Доступ до них здійснюється через гетери і сетери.
При створенні КОЖНОГО автомобіля обов'язково потрібно вказувати його номер, колір, максимальну кількість людей.

 */
package OOP.Lesson1_2;

public class ExemplarCar {
    public static void main(String[] args) {
        Car carTaxi1 = new Car();
        carTaxi1.setNumber(1234);
        carTaxi1.setColor("red");
        carTaxi1.setMaxHumanCount(2);
        carTaxi1.changeHumanCount();
        carTaxi1.printNumber();
        carTaxi1.changeState("авто їде");

        Car carTaxi2 = new Car();
        carTaxi2.setNumber(5678);
        carTaxi2.setColor("black");
        carTaxi2.setMaxHumanCount(7);
        carTaxi2.changeHumanCount();
        carTaxi2.printNumber();
        carTaxi2.changeState("авто стоїть з вимкненим двигуном");

    }
}
