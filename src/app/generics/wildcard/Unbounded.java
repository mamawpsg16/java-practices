package app.generics.wildcard;
import java.util.List;
public class Unbounded {
    public static void printList(List<?> list) {
        for (Object obj : list) { // Elements are treated as Object
            System.out.println(obj);
        }
    }

}
