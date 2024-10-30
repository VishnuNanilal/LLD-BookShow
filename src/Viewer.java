import java.util.*;

public class Viewer extends User{
    List<Ticket> tickets;
    Viewer(String name, String email, String password){
        super(name,email, password, Role.VIEWER);
        tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket){
        tickets.add(ticket);
    }

    public List<Ticket> getTickets(){
        return new ArrayList<>(tickets);
    }

    public boolean cancelTicket(Ticket ticket){
        if(tickets.contains(ticket)) {
            ticket.setTicketStatus(TicketStatus.CANCELLED);
            return true;
        }
        return false;
    }
}
