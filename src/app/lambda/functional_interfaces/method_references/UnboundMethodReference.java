package app.lambda.functional_interfaces.method_references;

import java.util.function.Function;

public class UnboundMethodReference {
    public static void example() {
        // Using lambda
        Function<String, Integer> lambdaLength = str -> str.length();

        // Using unbound method reference
        Function<String, Integer> methodRefLength = String::length;

        // The instance (string) is passed at runtime
        System.out.println(methodRefLength.apply("Hello")); // Output: 5
    }
}