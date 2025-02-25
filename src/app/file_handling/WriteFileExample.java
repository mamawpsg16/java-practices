package app.file_handling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void write() {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Hello, world!");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
