package p3;

import java.util.Random;

public class GamePiece {
    protected MutationStage stage;
    public GamePiece(MutationStage stage){
        this.stage = stage;
    }
    public void nextStage(){
        switch (stage.ordinal()){
            case 0:
                stage = MutationStage.SMALL;
                break;
            case 1 :
                stage = MutationStage.NORMAL;
                break;
            case 2:
                stage = MutationStage.LARGE;
                break;
            case 3:
                stage = MutationStage.HUGE;
                break;
        }
    }
    public static GamePiece randomPiece(){
        Random random = new Random();
        int rng = random.nextInt(MutationStage.values().length);
        switch (rng){
            case 0:
                return new GamePiece(MutationStage.FOOTNOTE);
            case 1:
                return new GamePiece(MutationStage.SMALL);
            case 2:
                return new GamePiece(MutationStage.NORMAL);
            case 3:
                return new GamePiece(MutationStage.LARGE);
            case 4:
                return new GamePiece(MutationStage.HUGE);
        }

        return new GamePiece(MutationStage.NORMAL);
    }

    public GamePiece moreMutated(GamePiece a, GamePiece b){
        int result = a.stage.compareTo(b.stage);
        if (result == -1){
            return b;
        }
        if (result == 1){
            return a;
        }
        else return a;
    }
    //Zur e): moreMutated funktioniert weiterhin, falls das Einfuegen in order geschieht. Die anderen Methoden decken den neuen Fall nicht bzw. falsch ab und müssten erneuert werden.
}
