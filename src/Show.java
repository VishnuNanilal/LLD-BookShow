import javax.script.ScriptEngine;
import java.util.List;
import java.util.Timer;

public class Show {
    ShowType show;
    Theater theater;
    Screen screen;
//    String time;
    Show(ShowType show, Theater theater, Screen screen){
        this.show=show;
        this.theater=theater;
        this.screen=screen;
    }
    public Ticket bookShow(Viewer buyer, Theater theater, int screenNum, List<Integer> seatNumbs, String time){
        for(Integer seatNum: seatNumbs) {
            boolean successful = theater.setSeatAsBooked(screenNum, seatNum);
            if(!successful) {
                return null;
            }
        }

        return new Ticket(buyer, theater, screen, seatNumbs, time);
    }
}
