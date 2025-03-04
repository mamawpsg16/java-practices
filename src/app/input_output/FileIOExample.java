package app.input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;

public class FileIOExample {
    public static void readingWritingText() {
        // Define the file name to work with
        String fileName = "test.txt";

        // Writing without buffering must explicitly close to avoid resource leaks
        // Try-With-Resources:
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write a string to the file
            writer.write("Hello, this is a Java I/O example.");
            writer.newLine(); // Add a new line
            writer.write("This line is written to the file.");
        } catch (IOException e) {
            // Handle any I/O errors
            e.printStackTrace();
        }

        // Reading from the file
        // Try-With-Resources:
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from file:");
            // Read each line until the end of the file is reached
            while ((line = reader.readLine()) != null) {
                // Output the line to the console
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle any I/O errors
            e.printStackTrace();
        }
    }

    public static void pathExample(){
        // Create a Path instance representing the file location
        Path filePath = Paths.get("test.txt");

        try {
            // Read all lines from the file into a List of Strings
            List<String> lines = Files.readAllLines(filePath);
            // Print each line to the console
            lines.forEach(System.out::println);
        } catch (IOException e) {
            // Handle any I/O errors
            e.printStackTrace();
        }
    }
}
