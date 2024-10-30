import java.util.*;

public class Viewer extends User{
    List<Ticket> tickets;
    Viewer(String name, String email, String password, Role role){
        super(name,email, password, role);
        tickets = new ArrayList<>();
    }

    public boolean addTicket(Ticket ticket){
        return tickets.add(ticket);
    }
}
