package p5;

public class Main {
    public static void main(String[] args) {
        /*
        Ergebnisse zu 5):
        a): Reflexivitaet, x.equals(x) ist false!
        b): Theoretisch nichts aber extrem unsinnig (ausser null, das verletzt).
        c): die Methode gibt für obj == null true zurueck, muss ich dazu noch was sagen?
        d): null nicht berücksichtigt, obj kann von anderem Typ sein
        e): null, sonst gut da int != null und instanceof + cast, wuerde Employee nicht existieren, da dieses int id nicht setzt, es also immer 0 ist.
        f): asymmetrisch.
        g): Ja, Transitivitaet wird verletzt: Bsp.: Obj. 1 vom Typ Person hat gleiche ID mit Obj 2 von Employee, Objekt 3 von Employee hat gleiche ID aber Dep. ist verschieden. So ist 1 gleich 2 und 1 gleich 3 aber 2 ungleich 3.



         */
    }
}
