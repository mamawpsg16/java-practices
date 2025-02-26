package app.array;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Set; // INTERFACE
import java.util.HashSet; // CONCRETE CLASS
import java.util.HashMap; // CONCRETE CLASS
import java.util.Map;// INTERFACE

public class Utilities {
    public static void arrayExample() {
        int[] numbers = {5, 2, 9, 1, 6};
        // Sorting the array
        Arrays.sort(numbers);

        // Printing the array
        System.out.println("ARRAY EXAMPLE");
        System.out.println(Arrays.toString(numbers));
    }

    public static void listExample() {
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Removing an element
        fruits.remove("Banana");
        System.out.println("LIST EXAMPLE");

        // Iterating through the list
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void setExample() {
        Set<String> names = new HashSet<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Duplicate, will not be added

        System.out.println("SET EXAMPLE");

        // Printing elements
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void mapExample() {
        Map<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(1, "John");
        students.put(2, "Emma");
        System.out.println("MAP EXAMPLE");

        // Accessing a value
        System.out.println("Student ID 1: " + students.get(1));

        // Iterating through a map
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
