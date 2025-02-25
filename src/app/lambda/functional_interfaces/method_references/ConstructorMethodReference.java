package app.lambda.functional_interfaces.method_references;
import java.util.function.Supplier;

public class ConstructorMethodReference {
    public static void example() {
        // Using lambda
        Supplier<User> lambdaUser = () -> new User();

        // Using constructor reference
        Supplier<User> methodRefUser = User::new;

        methodRefUser.get(); // Output: User Created!
    }
}