package p4;

import java.util.Objects;

public class Kinoticket {
    int date, time, seat;
    public Kinoticket(int date, int time, int seat){
        this.date = date;
        this.time = time;
        this.seat = seat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date,time,seat);
    }
}
