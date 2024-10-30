import java.util.*;

public class BookShowApplication
{
    public static int maxRating;
    List<Theater> theaters;
    List<User> users;

    BookShowApplication(int max){

        maxRating=max;
        theaters=new ArrayList<>();
        users=new ArrayList<>();
    }

    public List<Theater> fetchAllTheaters(){
        return new ArrayList<>(theaters);
    }

    public List<Theater> fetchTheaterByLocation(String city){
        List<Theater> ans=new ArrayList<>();
        for(Theater theater: theaters){
            if(theater.location.city.equals(city)){
                ans.add(theater);
            }
        }
        return ans;
    }

    public boolean bookShow(Viewer buyer, Theater theater, int screenNum, List<Integer> seatNumbs, String time) {
        Show show = theater.screens.get(screenNum).show;
        Ticket ticket = show.bookShow(buyer, theater, screenNum, seatNumbs, time);
        buyer.addTicket(ticket);
        return true;
    }
}
