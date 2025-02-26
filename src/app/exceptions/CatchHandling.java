package app.exceptions;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.io.*;

public class CatchHandling {
    public static void tryCatchExample(){
        try {
            int result = 10 / 0; // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!"); // Handling the exception
        }
    }

    public static void multiCatching(){
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("An arithmetic or array exception occurred.");
        }
    }

    public static void finallyBlock(){
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void tryWithResourcesExample(){
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }

    public static void suppressedExceptionExample() {
        try (MyResource resource = new MyResource()) {
            throw new Exception("Primary Exception");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
            // Retrieve suppressed exceptions
//            for (Throwable suppressed : e.getSuppressed()) {
//                System.out.println("Suppressed: " + suppressed.getMessage());
//            }
        }
    }

    public static void autoCloseableExample(){
        try (MyAutoCloseable resource = new MyAutoCloseable()) {
            System.out.println("Using the resource.");
        }
    }

    public static void exceptionHandlingExample() {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            System.out.println(br.readLine()); // Read file content
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            System.out.println("Execution finished.");
        }
    }
}
