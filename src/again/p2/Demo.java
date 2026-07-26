package again.p2;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ShoppingList sl = new ShoppingList();
        List<String> list = sl.createList("Milch", "Mehl", "Butter","Zucker");
        for (String s : list){
            System.out.println(s);
        }
        //add wäre böse, ich glaube, diese Aufgabe ist ein Idiotentest oder so. Sie sagt man erstellt eine unveränderliche List????
    }
}
