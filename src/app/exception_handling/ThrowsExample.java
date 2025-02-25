package app.exception_handling;
import java.io.IOException;

public class ThrowsExample {
    public static void checkFile() throws IOException {
        throw new IOException("File not found.");
    }
}
