package app.scanner;


import java.util.Scanner;
import java.util.regex.MatchResult;

public class ScannerExample {
    public void scan(String... args) {
        String wordsAndNumbers = """
                Longing rusted furnace
                daybreak 17 benign 
                9 homecoming 1 
                freight car
                benign
                """;

        try (Scanner scanner = new Scanner(wordsAndNumbers)) {
            scanner.findAll("benign").map(MatchResult::group).forEach(System.out::println);
        }
    }

    public void introduce(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer

        System.out.print("Enter your height: ");
        double height = scanner.nextDouble(); // Reads a decimal number

        System.out.println("You are " + age + " years old and " + height + "m tall.");

        scanner.close();
    }

}
