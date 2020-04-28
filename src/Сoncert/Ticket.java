package Сoncert;
import lombok.Data;
@Data
public class Ticket {
    private int number;
    private int row;
    private int seat;
    private boolean win;

    public Ticket(int number, int row, int seat) {
        this.number = number;
        this.row = row;
        this.seat = seat;
    }
    Ticket oneTicket = new Ticket(10, 2,1);
    Ticket twoTicket = new Ticket(8, 1,3);
    Ticket threeTicket = new Ticket(2, 4,4);
    Ticket fourTicket = new Ticket(3, 5,5);
    Ticket fiveTicket = new Ticket(4, 6,2);

}
