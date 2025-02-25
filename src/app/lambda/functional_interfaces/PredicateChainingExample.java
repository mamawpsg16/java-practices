package app.lambda.functional_interfaces;
import java.util.function.Predicate;

public class PredicateChainingExample {
    public static void example() {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isPositive = n -> n > 0;

        // Chaining predicates
        Predicate<Integer> isPositiveEven = isEven.and(isPositive);
        Predicate<Integer> isOddOrNegative = isEven.negate().or(isPositive.negate());

        System.out.println(isPositiveEven.test(4));  // true (4 is even and positive)
        System.out.println(isPositiveEven.test(-4)); // false (-4 is even but not positive)
        System.out.println(isOddOrNegative.test(-3)); // true (-3 is odd or negative)
    }
}