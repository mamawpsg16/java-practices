package app.lambda.functional_interfaces;

import java.util.function.Function;

public class FunctionExample {
    public static void function() {
        Function<String, Integer> lengthFunction = str -> str.length();

        System.out.println(lengthFunction.apply("Hello")); // Output: 5
    }
}