package p2;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> l = ShoppingList.createList("Milch", "Mehl", "Butter", "Zucker");
        //l.add("Stainless steel bars"); //unerlaubt! Liste ist unveränderlich, da List.of(); das so macht.
        for (String s : l){
            System.out.println(s);
        }
    }
}
