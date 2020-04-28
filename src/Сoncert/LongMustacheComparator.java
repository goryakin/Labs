package Сoncert;

import java.util.Comparator;

    public class LongMustacheComparator implements Comparator<Listener> {
        @Override
        public int compare(Listener man1, Listener man2) {

            if (man1.getLongMustache() == man2.getLongMustache()) {
                return 0;
            }
            if (man1.getLongMustache() > man2.getLongMustache()) {
                return -1;
            }
            else {
                return +1;
            }
        }
    }

