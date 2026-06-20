package p1;

import java.util.List;

public class ShoppingListUtil {
    public static List<Article> createList(Article... articles){
        return List.of(articles);
    }
    public static void printList(List<Article> list){
        for (Article a : list){
            System.out.println(a.getName());
        }
    }
}
