package app.generics.wildcard;

import java.util.List;

public class WildcardExample {
    // Accepts List of any type
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
