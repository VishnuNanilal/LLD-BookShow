public class Seat {
    SeatType type;
    int seatNum;
    boolean booked=false;
    Viewer viewer;
    Seat(int seatNum){
        this.seatNum=seatNum;
    }

    public boolean setBuyer(Viewer buyer){
        if(viewer!=null){
            return false;
        }
        viewer=buyer;
        return true;
    }

    public boolean removeViewer(Viewer buyer){
        if(buyer==null){
            return false;
        }
        buyer=null;
        return true;
    }
}
