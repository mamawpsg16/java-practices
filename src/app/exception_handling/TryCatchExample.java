package app.exception_handling;

public class TryCatchExample {
    public TryCatchExample(){
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
