//8. Знайти суму всіх додатніх двозначних чисел, кратних 17.
package vertexStart.Lesson2;
public class Task8 {
    public static void main(String[] args) {
        int sum =0;
        for (int i = 0; i <=99 ; i++) {
            if (i%17==0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
