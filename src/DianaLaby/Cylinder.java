
// S =  2 π r(h+ r) - площа поверхні
package DianaLaby;

public class Cylinder {
    private int radiusCylinder;
    private int height;
    private int radiusBall;
    static private String colorBall;
    //конструктор без параметров
    public Cylinder() {
    }
//конструктор с параметрами
    public Cylinder(int radiusCylinder, int height) {
        this.radiusCylinder = radiusCylinder;
        this.height = height;
    }
//метод визначення прощі поверхні циліндру
    public void squareSurface () {
        double S = 2*3.14*radiusCylinder*(height+radiusCylinder);
        System.out.println("Площа поверхні циліндру дорівнює: "+S);
    }
// метод визначення входження кулі у циліндр
    public void isPlacing () {
        if (radiusBall<radiusCylinder)
        System.out.println("Кулю можна розмістити всередині циліндру");
        else
        System.out.println("Помилка. Кулю не можна розмістити всередині циліндру");
    }
    public int getRadiusCylinder(int i) {return radiusCylinder;}
    public void setRadiusCylinder(int radiusCylinder) {this.radiusCylinder = radiusCylinder;}
    public int getHeight(int i) {return height;}
    public void setHeight(int height) {this.height = height;}
    public int getRadiusBall(int i) {return radiusBall;}
    public void setRadiusBall(int radiusBall) {this.radiusBall = radiusBall;}
    public static String getColorBall() {return colorBall; }
    public static void setColorBall(String colorBall) {Cylinder.colorBall = colorBall;}
    public static void colorBall () {System.out.println("Колір кулі: "+getColorBall());
    }
}
