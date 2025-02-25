package app.lambda.functional_interfaces.method_references;

import java.util.function.Function;

public class StaticMethodReference {
    public static void example() {
        // Using lambda
        Function<Integer, Integer> lambdaSquare = n -> MathUtil.square(n);

        // Using method reference - MathUtil::square is a static method reference equivalent to n -> MathUtil.square(n).
        Function<Integer, Integer> methodRefSquare = MathUtil::square;

        System.out.println(methodRefSquare.apply(5)); // Output: 25
    }
}