/*
ЗАДАЧА 1
---------------------------------
Створити клас Human, який має поля вага, вік, стать, ім'я. Створити можливість
змінити ім'я, вік та вагу (вік та вага мають бути більші від 0).
Створити клас Student, який крім віку, статі і імені має поле курсу,
по якому навчається, а також рік навчання. Додати метод, який дозволяє змінити рік навчання та назву курсу.
Прийняти, що одочасно студент може навчатися лише на 1 курсі.
 */
package OOP.Lesson1_2;

public class Human {
    private String name;
    private String gender;
    private int age=20;
    private int weight=50;

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge (int age) {
        if (age >0) {
            this.age = age;
        } else {
            System.out.println("Помилка! Вік не може бути менше нуля!");
        }
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight (int weight) {
        if (weight>0) {
            this.weight = weight;
        } else {
            System.out.println("Помилка! Вага не може бути менше нуля!");
        }
    }
}
