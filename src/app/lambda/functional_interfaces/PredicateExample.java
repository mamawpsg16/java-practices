package app.lambda.functional_interfaces;

import java.util.function.Predicate;

public class PredicateExample {
    public static void predicate() {
        Predicate<Integer> isEven = number -> number % 2 == 0;

        System.out.println(isEven.test(10)); // Output: true
        System.out.println(isEven.test(7));  // Output: false
    }
}
