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
    class Student extends Human{
    private String course="Pyton";
    private int year=2000;

        public String getCourse() {
            return course;
        }
        public void setCourse(String course) {
            this.course =course;
        }
        public int getYear() {
            return year;
        }
        public void setYear(int year) {
            this.year = year;
        }
 }
