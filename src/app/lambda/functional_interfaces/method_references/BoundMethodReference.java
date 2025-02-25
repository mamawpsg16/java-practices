package app.lambda.functional_interfaces.method_references;

import java.util.function.Supplier;

public class BoundMethodReference {
    public static void example() {
        Printer printer = new Printer();

        // Using lambda
        Supplier<String> lambdaPrint = () -> printer.printMessage();

        // Using bound method reference
        Supplier<String> methodRefPrint = printer::printMessage;

        // No need to pass an instance; it's already bound
        methodRefPrint.get(); // Output: Hello from Printer!
    }
}