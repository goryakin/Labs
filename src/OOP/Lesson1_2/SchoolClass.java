/*
Створити клас НавчальнийКлас. Він складається з:
- набору вільних місць (масив із boolean, де кожен елемент позначає, місце зайняте чи ні)
- набору студентів (кожен студент - просто ім'я String)
- методів, які дозволяють посадити студента в класну кімнату, видалити студента з кімнати, додати місцк, видалити місце.
Масив вільних місць та масив студентів мають бути синхронізовані (напроти місця має бути студент, який за ним сидить)
Використання колекцій (ArrayList та ін.) ЗАБОРОНЕНО. Для збереження даних використовувати масиви.
Приклад місць та студентів:
boolean [] freePlaces = { true, false, false, true, false }
String [] students = {null, "Вася", "Вова", null, "Аня"}
У main протестувати усі методи та поля.
 */
package OOP.Lesson1_2;

public class SchoolClass {
    private boolean[] freePlaces = {true, false, false, true, false};
    private String[] students = {"Петя", "Вася", "Вова", "Маша", "Аня"};

    public boolean[] getFreePlaces() {
        return freePlaces;
    }

    public String[] getStudents() {
        return students;
    }

    public void synchronizationStudents() {
        for (int i = 0; i < freePlaces.length; i++) {
            if (freePlaces[i] == true) {
                for (int j = 0; j < students.length; j++) {
                }
                System.out.println(students[i] + " Дозволено сісти");
            } else {
                System.out.println(students[i] + " Місце зайняте");
            }
        }
    }

    public void delPlace() {
        for (int i = 0; i < freePlaces.length; i++) {
            if (freePlaces[i] == true) {
                freePlaces[i] = false;
            }
            System.out.print(freePlaces[i] + ", ");
        }
    }

    public void addPlace() {
        for (int i = 0; i < freePlaces.length; i++) {
            if (freePlaces[i] == false) {
                freePlaces[i] = true;
            }
            System.out.println(freePlaces[i] + ", ");
        }
    }
        public void addStudents () {
        }
        public void delStudents () {
        }
    }
