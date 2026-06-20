package p3;

import p4.Visitor;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println(GamePiece.mostMutated(new GamePiece(MutationStage.FOOTNOTE),new GamePiece(MutationStage.NORMAL),new GamePiece(MutationStage.SMALL),new GamePiece(MutationStage.HUGE),new GamePiece(MutationStage.LARGE)));
        HashSet<Visitor> visitors = new HashSet<>();
        visitors.add(new Visitor(1, "Anna"));
        visitors.add(new Visitor(1, "Anna"));
        visitors.add(new Visitor(2, "Ben"));
        visitors.add(new Visitor(3, "Clara"));
        // 3/4 wenn hashCode auskommentiert ist.
        System.out.println(visitors.size());

    }
}
