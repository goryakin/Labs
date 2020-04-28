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
public class Car {
    private int number;
    private String color;
    private int humanCount;
    private int maxHumanCount;
    private String[] state = {"авто їде", "авто стоїть заведене", "авто стоїть з вимкненим двигуном"};

    public int getNumber(){
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
        public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getMaxHumanCount() {
        return maxHumanCount;
    }
    public void setMaxHumanCount(int maxHumanCount) {
        this.maxHumanCount = maxHumanCount;
    }

    public void printNumber() {
        System.out.println("Номер автомобіля " + number);
        System.out.println("Колір автомобіля "+ color);
        System.out.println("Кількість людей в авто "+ humanCount);
    }

    public void changeHumanCount() {
        int amountHuman = (int) ((Math.random() * 10)) - 5;
        System.out.println("Генератор перевірки кількості людей в авто "+amountHuman);
        if (amountHuman < 0) {
            System.out.println("Кількість людей, що виходить з авто " + Math.abs(amountHuman));
        } else {
            System.out.println("Кількість людей, що заходить в авто " + amountHuman);
            if (amountHuman < 0 || amountHuman > maxHumanCount) {
                System.out.println("Недопустима кількість людей, перевищує максимальну ");
            }

        }
    }
    public void changeState(String newState) {
        switch (state.length) {
            case 1:
                System.out.println("авто їде");
                break;
            case 2:
                System.out.println("авто стоїть заведене");
                break;
            case 3:
                System.out.println("авто стоїть з вимкненим двигуном");
                break;
           }
        }
    }

