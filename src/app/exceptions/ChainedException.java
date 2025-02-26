package app.exceptions;

public class ChainedException {
    public static void method1() throws Exception {
        try {
            method2();
        } catch (ArithmeticException e) {
            throw new Exception("Exception in method1", e);
        }
    }

    static void method2() {
        throw new ArithmeticException("Division by zero");
    }
}
