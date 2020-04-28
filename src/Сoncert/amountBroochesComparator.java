package Сoncert;

import java.util.Comparator;

    public class amountBroochesComparator implements Comparator<Listener> {
        @Override
        public int compare(Listener woman1, Listener woman2) {

            if (woman1.getAmountBrooches() == woman2.getAmountBrooches()) {
                return 0;
            }
            if (woman1.getAmountBrooches() > woman2.getAmountBrooches()) {
                return -1;
            }
            else {
                return +1;
            }
        }
    }