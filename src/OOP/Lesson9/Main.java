package OOP.Lesson9;
import java.util.ArrayList;
public class Main extends MyThread{
    public Main(int number) {
        super(number);
    }

    public static void main(String[] args) throws InterruptedException {
        ArrayList <MyThread> threads = new ArrayList();
        for (int i = 0; i <10 ; i++) {
            MyThread t = new MyThread(5);
            t.start();
            threads.add (t);
        }
        for (int i = 0; i <threads.size() ; i++) {
            threads.get(i).join();
        }
    }
}
