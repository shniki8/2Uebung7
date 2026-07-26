package again.p3;

import java.util.Random;

public class GamePiece {
    private MutationStage stage;

    public GamePiece(MutationStage stage){
        this.stage = stage;
    }

    public void nextStage(){
        if (stage != MutationStage.HUGE){
            stage = MutationStage.values()[stage.ordinal()+1];
        }
    }
    public static GamePiece randomPiece(){
        return new GamePiece(MutationStage.values()[new Random().nextInt(MutationStage.values().length)]);
    }

    public static GamePiece moreMutated(GamePiece a, GamePiece b){
        //return (a.stage.ordinal() >= b.stage.ordinal()) ? a : b;
        //Anforderung:
        switch (a.stage.compareTo(b.stage)){
            case 1:
            case 0:
                return a;
            case -1:
                return b;
            default:
                return null; // Have fun :D
        }
    }
}
