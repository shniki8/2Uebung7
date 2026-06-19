package p1;

public abstract class PFood extends Food{
    int popularity, amount;
    PFood(int popularity){
        popular = true;
        this.popularity = popularity;
    }

    @Override
    boolean warning() {
        if (amount > household){
            return true;
        }
        else return false;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
