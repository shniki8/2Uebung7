package again.p4;

import java.util.Objects;

public class Visitor {
    private int id;
    private String name;

    public Visitor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) return false;
        return this.id == ((Visitor)obj).id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
