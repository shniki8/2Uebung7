package again.p1;

public class Milk extends PFood{
    public Milk(int a, int d, int p){
        super(p);
        setAmount(a);
        household = 20;
        disQuantity = d;
    }

    @Override
    String getName() {
        return "Milk";
    }

    @Override
    int discountQuantity() {
        return (amount >= disQuantity) ? 12 : 0 ;
    }
}
