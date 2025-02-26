package app.exceptions;

public class Error {
    public static void recursiveMethod() {
        recursiveMethod(); // Causes StackOverflowError
    }
}