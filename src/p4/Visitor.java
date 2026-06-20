package p4;

import javax.sound.midi.MidiMessage;
import java.util.Objects;

public class Visitor {
    private int id;
    private String name;
    public Visitor(int id, String name){
        this.id = id;
        this.name = name;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Visitor visitor = (Visitor) o;
        return id == visitor.id && Objects.equals(name, visitor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
