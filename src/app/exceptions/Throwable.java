package app.exceptions;

public class Throwable {
    // Example: Throwable class methods
    public static void example() {
        try {
            throw new Exception("Custom Exception");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            e.printStackTrace(); // Prints stack trace
        }
    }
}
