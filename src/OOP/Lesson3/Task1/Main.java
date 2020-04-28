package OOP.Lesson3.Task1;

public class Main {
    public static void main(String[] args) {
        Dentist dentist = new Dentist();
        String organ = "eye";
        dentist.tools = new String[]{"skalpel", "hose", "tweezers"};
        dentist.checkOrgan();
    }
}
