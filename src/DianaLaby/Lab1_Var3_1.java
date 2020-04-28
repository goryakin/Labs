package DianaLaby;

public class Lab1_Var3_1 {
    public static void main(String[] args) {
        double y = 6;
        double h = 7;
        double A = (Math.tan(Math.pow(y, 3) - Math.pow(h, 4)) + Math.pow(h, 2)) / (Math.pow(Math.sin(h), 3) + y);
        System.out.println("Результат= "+ A);
    }
}
