package again.p1;

public class Flour extends PFood{

    public Flour(int a, int d, int p){
        super(p);
        amount = a;
        disQuantity = d;
        household = 15;
    }
    @Override
    String getName() {
        return "Flour";
    }
    @Override
    int discountQuantity() {
        return (amount >= disQuantity) ? 5 : 0 ;
    }
}
