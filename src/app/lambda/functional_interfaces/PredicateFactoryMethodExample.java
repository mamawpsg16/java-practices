package app.lambda.functional_interfaces;
import java.util.function.Predicate;

public class PredicateFactoryMethodExample {
    public static void example() {
        Predicate<String> isJava = Predicate.isEqual("Java");

        System.out.println(isJava.test("Java"));  // true
        System.out.println(isJava.test("Python")); // false
    }
}