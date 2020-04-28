package DianaLaby;

import java.util.Scanner;

public class MainCylinder extends Cylinder{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println("Введіть висоту циліндру, радіус циліндру, та радіус кулі");
        Scanner scanner = new Scanner(System.in);
        cylinder.setHeight(scanner.nextInt());
        cylinder.setRadiusCylinder(scanner.nextInt());
        cylinder.setRadiusBall(scanner.nextInt());
        cylinder.squareSurface();
        cylinder.isPlacing();
        setColorBall("green");
        colorBall();
    }
}
