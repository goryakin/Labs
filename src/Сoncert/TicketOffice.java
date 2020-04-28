package Сoncert;

import java.util.HashMap;

public class TicketOffice {
    public static void main(String[] args) {
       HashMap<Class<Ticket>, Class<MainListener>> myHashMap = new HashMap<>();
       myHashMap.put(Ticket.class,MainListener.class);

        System.out.println(myHashMap.size());
        System.out.println(myHashMap);
    }
}

