package p1;

public class Milk extends PFood{
    public Milk(int a, int d, int p){
        super(p);
        this.disQuantity = d;
        this.amount = a;
        this.household = 20;
    }

    @Override
    int discountQuantity() {
        if (amount>disQuantity){
            return 12;
        }
        return 0;

    }
}
