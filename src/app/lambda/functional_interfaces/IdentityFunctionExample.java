package app.lambda.functional_interfaces;

import java.util.function.Function;

public class IdentityFunctionExample {
    public static void example() {
        Function<String, String> identityFunction = Function.identity();

        System.out.println(identityFunction.apply("Hello!")); // Hello!
    }
}
