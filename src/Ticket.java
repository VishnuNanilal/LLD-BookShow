import java.util.List;

public class Ticket {
    User buyer;
    Theater theater;
    Screen screen;
    //showTime
    List<Integer> seatNumbs;
    String time;
    int amount;
    Ticket(User buyer, Theater theater, Screen screen, List<Integer> seatNumbs, String time){
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
}
