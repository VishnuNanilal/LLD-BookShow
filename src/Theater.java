import java.util.HashMap;
import java.util.List;

public class Theater
{
    GeoLocation location;
    List<Screen> screens;
    User owner;
    float rating;
    HashMap<SeatType, Integer> seatToPriceMap;
    Theater(GeoLocation loc, List<Screen> screens, User owner){
        this.location=loc;
        this.screens=screens;
        this.owner=owner;
        this.seatToPriceMap=new HashMap<>();
    }

    public void setPriceToSeatType(SeatType type, Integer price){
        seatToPriceMap.put(type, price);
    }

    public boolean setSeatAsBooked(Viewer buyer, int screenNum, int seatNum){
        try{
            Seat seat = screens.get(screenNum).seats.get(seatNum);
             if(seat.booked){
                 System.out.print("Seat already booked");
                 return false;
             }

             seat.booked=true;
             seat.setBuyer(buyer);
             return true;
        }
        catch(IndexOutOfBoundsException iob){
            iob.printStackTrace();
            return false;
        }
    }
}

//<class>
//Theater
//-location: GeoLocation
//-screens: List<Screen>
//-owner: User
//-rating: float