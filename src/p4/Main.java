package p4;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Kinoticket> hs = new HashSet<>();
        hs.add(new Kinoticket(1,18,69));
        hs.add(new Kinoticket(1,18,69));
        hs.add(new Kinoticket(1,18,69));
        hs.add(new Kinoticket(2,20,67));
        hs.add(new Kinoticket(3,9,4));
        hs.add(new Kinoticket(9,12,49));
        System.out.println(hs.size());
        for(Kinoticket k : hs){
            System.out.println(k);
        }
    }
}
