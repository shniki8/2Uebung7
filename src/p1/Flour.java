package p1;

public class Flour extends PFood{
    public Flour(int a, int d, int p){
        super(p);
        this.disQuantity = d;
        this.amount = a;
        this.household = 15;
    }
    @Override
    int discountQuantity() {
        if (amount>disQuantity){
            return 5;
        }
        return 0;
    }

    @Override
    public String getName() {
        return "Flour";
    }
}
