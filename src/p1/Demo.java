package p1;

public class Demo {
    public static void main(String[] args) {
        ShoppingListUtil.printList(ShoppingListUtil.createList(new Milk(1,2,4), new Milk(5,7,9), new Flour(1,2,3)));
    }
}
