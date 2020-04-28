package OOP.Lesson1_2;

public class mainStudent  {

    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Початковий рік: " +student.getYear());
        student.setYear(2001);
        System.out.println("Змінений рік навчання: "+student.getYear());

        System.out.println("Навчальний курс: "+student.getCourse());
        student.setCourse("Java");
        System.out.println("Змінений курс начання: "+student.getCourse());

        System.out.println("Вік студента: " +student.getAge());
        student.setAge(-10);
        System.out.println(student.getAge());

        System.out.println("Вага студента: " +student.getWeight());
        student.setWeight(-100);
        System.out.println(student.getWeight());

        System.out.println("Вага студента: " +student.getWeight());
        student.setWeight(60);
        System.out.println(student.getWeight());


    }
}
