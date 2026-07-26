package again.p4;

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

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Kinoticket k = (Kinoticket) obj;
        if (date == k.date && time == k.time && seat == k.seat){
            return true;
        }else return false;
    }
}
