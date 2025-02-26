package app.refactory_to_functional_style;

//Sample.java
import java.nio.file.*;

public class ReadingExternalResource {
    public static void imperativeStyle() {
        try {
            final var filePath = "test.txt";
            final var wordOfInterest = "Hello";

            try (var reader = Files.newBufferedReader(Path.of(filePath))) {
                String line = "";
                long count = 0;

                while((line = reader.readLine()) != null) {
                    if(line.contains(wordOfInterest)) {
                        count++;
                    }
                }

                System.out.println(String.format("Found %d lines with the word %s", count, wordOfInterest));
            }
        } catch(Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public static void functionalStyle(){
        try {
            final var filePath = "test.txt";
            final var wordOfInterest = "Hello";

            try(var stream = Files.lines(Path.of(filePath))) {
                long count = stream.filter(line -> line.contains(wordOfInterest)).count();

                System.out.println(String.format("Found %d lines with the word %s", count, wordOfInterest));
            }
        } catch(Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
