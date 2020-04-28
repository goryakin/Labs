package Сoncert;

import java.util.ArrayList;
import java.util.TreeSet;

public class MainListener {
    public static void main(String[] args) {
        TreeSet<Listener> listenerArrayList = new TreeSet<Listener>();
        Listener oneListener = new Listener("man", 3, 0);
        Listener twoListener = new Listener("woman", 0, 7);
        Listener threeListener = new Listener("man", 4, 0);
        Listener fourListener = new Listener("woman", 0, 5);
        Listener fiveListener = new Listener("man", 2, 0);

        listenerArrayList.add(oneListener);
        listenerArrayList.add(twoListener);
        listenerArrayList.add(threeListener);
        listenerArrayList.add(fourListener);
        listenerArrayList.add(fiveListener);

        for (Listener p : listenerArrayList) {
            System.out.println(p);
        }
        ArrayList<Listener> myListenerArrayList = new ArrayList<Listener>();
        myListenerArrayList.add(oneListener);
        myListenerArrayList.add(twoListener);
        myListenerArrayList.add(threeListener);
        myListenerArrayList.add(fourListener);
        myListenerArrayList.add(fiveListener);
        System.out.println();

        for (Listener humam: myListenerArrayList) {
            System.out.println(humam);
        }

        LongMustacheComparator myLongMustacheComparator = new LongMustacheComparator();
        myListenerArrayList.sort(myLongMustacheComparator);

        amountBroochesComparator myamountBroochesComparator = new amountBroochesComparator();
        myListenerArrayList.sort(myamountBroochesComparator);

        System.out.println("Sorted: ");
        for (Listener queue: myListenerArrayList) {
            System.out.println(queue);
        }
    }
}
