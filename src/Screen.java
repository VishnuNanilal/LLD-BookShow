import java.util.ArrayList;
import java.util.List;

public class Screen {
    Show show;
    List<Seat> seats;
    Screen(Show show, ArrayList<Seat> seats){
        this.show=show;
        this.seats=seats;
    }

    public boolean setTicketToSeat(int i, Ticket ticket){
        try{
            seats.get(i).booked=true;
            return true;
        }
        catch(IndexOutOfBoundsException iob){
            iob.printStackTrace();
            return false;
        }
    }
}
