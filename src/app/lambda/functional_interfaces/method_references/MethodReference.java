package app.lambda.functional_interfaces.method_references;

import java.util.Arrays;
import java.util.List;


public class MethodReference {
    public static void example(){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using a lambda expression
        names.forEach(name -> System.out.println(name));

        // Using a method reference
        names.forEach(System.out::println);
    }

    public static int square(int num) {
        return num * num;
    }
}
