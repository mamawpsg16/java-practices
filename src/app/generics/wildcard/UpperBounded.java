package app.generics.wildcard;
import java.util.List;
public class UpperBounded {
    // Method that accepts only Number or its subclasses
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number num : list) {
            sum += num.doubleValue(); // Allowed because we know it's a Number or subclass
        }
        return sum;
    }
}
