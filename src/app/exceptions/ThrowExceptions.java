package app.exceptions;

import java.io.*;
public class ThrowExceptions {

    // This method specifies that it may throw an IOException
    public static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistent.txt");
        file.read();
        file.close();
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Valid age");
    }
}


