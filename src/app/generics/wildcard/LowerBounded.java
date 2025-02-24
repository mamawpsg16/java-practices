package app.generics.wildcard;
import java.util.List;
public class LowerBounded {
    // Method that accepts List of Integer or its superclasses
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}
