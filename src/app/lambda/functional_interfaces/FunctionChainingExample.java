package app.lambda.functional_interfaces;

import java.util.function.Function;

public class FunctionChainingExample {
    public static void example() {
        Function<Integer, Integer> multiplyByTwo = n -> n * 2;
        Function<Integer, Integer> addTen = n -> n + 10;

        // Using andThen(): (n * 2) -> (+10)
        Function<Integer, Integer> multiplyThenAdd = multiplyByTwo.andThen(addTen);

        // Using compose(): (+10) -> (n * 2)
        Function<Integer, Integer> addThenMultiply = multiplyByTwo.compose(addTen);

        System.out.println(multiplyThenAdd.apply(5)); // (5*2) + 10 = 20
        System.out.println(addThenMultiply.apply(5)); // (5+10) * 2 = 30
    }
}
