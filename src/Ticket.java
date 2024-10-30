import java.util.List;

public class Ticket {
    Viewer buyer;
    Theater theater;
    Screen screen;
    //showTime
    List<Integer> seatNumbs;
    String time;
    TicketStatus status;
    int amount;
    Ticket(Viewer buyer, Theater theater, Screen screen, List<Integer> seatNumbs, String time){
        this.buyer=buyer;
        this.theater=theater;

        this.screen=screen;
        this.seatNumbs =seatNumbs;
        this.amount=calcAmount();
    }

    private int calcAmount(){
        for(Integer seatNum: seatNumbs){
            Seat seat=screen.seats.get(seatNum);
            amount += theater.seatToPriceMap.get(seat.type);
        }
        return amount;
    }

    public void setTicketStatus(TicketStatus status){
        this.status=status;
    }
}