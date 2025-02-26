package app.exceptions;

public class StackTrace {
    public static void example() {
        try {
            int a = 5 / 0; // Causes ArithmeticException
        } catch (Exception e) {
            StackTraceElement[] elements = e.getStackTrace();
            for (StackTraceElement element : elements) {
                System.out.println(element);
            }
        }
    }
}
