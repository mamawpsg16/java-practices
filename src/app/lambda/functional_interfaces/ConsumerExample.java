package app.lambda.functional_interfaces;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void consumer() {
        Consumer<String> consumer = message -> System.out.println("Consumed: " + message);
        consumer.accept("Hello, Consumer!"); // Output: Consumed: Hello, Consumer!
    }
}