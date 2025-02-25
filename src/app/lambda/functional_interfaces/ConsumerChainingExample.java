package app.lambda.functional_interfaces;

import java.util.function.Consumer;

public class ConsumerChainingExample {
    public static void example() {
        Consumer<String> greet = s -> System.out.println("Hello, " + s);
        Consumer<String> shout = s -> System.out.println(s.toUpperCase());

        // Chaining consumers
        Consumer<String> greetThenShout = greet.andThen(shout);

        greetThenShout.accept("John");
    }
}