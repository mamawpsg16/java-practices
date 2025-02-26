package app.exceptions;

public class CustomExceptionExample {
    public static void checkValue(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Negative value not allowed");
        }
        System.out.println("Valid value: " + value);
    }
}