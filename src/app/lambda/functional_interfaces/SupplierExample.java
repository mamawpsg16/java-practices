package app.lambda.functional_interfaces;

import java.util.function.Supplier;
public class SupplierExample {
    public static void supplier() {
        Supplier<String> supplier = () -> "Hello, Supplier!";
        System.out.println(supplier.get()); // Output: Hello, Supplier!
    }
}