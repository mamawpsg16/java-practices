package app.api_collections;

import java.util.HashMap;
import java.util.Map;

public class UsingMapsKeyValuePair {
    public static void mapExample(){
        // Creating a HashMap
        Map<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        // Updating a value
        students.put(1, "Kevin"); // Alice's age is updated to 26
        students.put(1, "Kevin"); // Alice's age is updated to 26

        // Checking if a key exists
        if (students.containsKey(1)) {
            System.out.println(" 1 = " +students.get(1));
        }

        // Removing an entry
        students.remove(3);

        // Retrieving a value using a key
        System.out.println("Student with ID 2: " + students.get(2));

        // Iterating through the Map
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void mapFactoryExample() {
            // Creating an immutable Map using Map.of()
            Map<String, Integer> scores = Map.of(
                    "Alice", 90,
                    "Bob", 85,
                    "Charlie", 88
            );

              // Accessing values
            System.out.println("Charlie's score: " + scores.get("Charlie"));

            // scores.put("David", 92); // This will throw an UnsupportedOperationException
    }

    public static void mapMethodsExample() {
        Map<String, String> capitalCities = new HashMap<>();

        capitalCities.put("USA", "Washington D.C.");
        capitalCities.put("France", "Paris");
        capitalCities.put("Japan", "Tokyo");

        // Checking if a key exists
        System.out.println("Does USA exist? " + capitalCities.containsKey("USA"));

        // Checking if a value exists
        System.out.println("Does Paris exist? " + capitalCities.containsValue("Paris"));

        // Getting all keys
        System.out.println("Countries: " + capitalCities.keySet());

        // Getting all values
        System.out.println("Capital Cities: " + capitalCities.values());

        // Getting all entries
        System.out.println("Entries: " + capitalCities.entrySet());
    }
}
