package app.api_collections;

import java.util.*;

public class HandlingMapValuesWithLambda {
    public static void example(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.replace(1, "Four");
        map.replace(1, "Four", "Five");

        map.replaceAll((key, value) -> value.toUpperCase());
        map.forEach((key, value) -> System.out.println(key + " :: " + value));
    }


    public static void computeExample() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);

        // Compute a new value for an existing key
        scores.compute("Alice", (key, value) -> value + 5); // Increases Alice's score by 5

        // Compute a value for a non-existing key (null will be passed as the value)
        scores.compute("Charlie", (key, value) -> (value == null) ? 80 : value + 10);

        System.out.println(scores); // {Alice=95, Bob=85, Charlie=80}
    }

    public static void computeIfAbsentExample() {
        Map<String, String> users = new HashMap<>();
        users.put("john", "John Doe");

        // Add only if the key is absent
        users.computeIfAbsent("jane", key -> "Jane Doe");
        users.computeIfAbsent("john", key -> "New John");

        System.out.println(users); // {john=John Doe, jane=Jane Doe}
    }

    public static void computeIfPresentExample() {
        Map<String, Integer> productStock = new HashMap<>();
        productStock.put("Laptop", 10);
        productStock.put("Phone", 5);

        // Reduce stock for an existing product
        productStock.computeIfPresent("Laptop", (key, value) -> value - 2);

        // This won't do anything since "Tablet" isn't present
        productStock.computeIfPresent("Tablet", (key, value) -> value - 1);

        System.out.println(productStock); // {Laptop=8, Phone=5}
    }

    public static void mergeExample(){
        Map<String, Integer> wordCount = new HashMap<>();
        wordCount.put("hello", 2);
        wordCount.put("world", 1);

        // If key exists, sum the existing and new value
        wordCount.merge("hello", 3, Integer::sum);

        // If key doesn't exist, add new value
        wordCount.merge("java", 4, Integer::sum);

        System.out.println(wordCount); // {hello=5, world=1, java=4}
    }

    public static void mergeWithNullExample() {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 96);
        scores.put("Bob", 85);

        // Remove entry if merge function returns null
        scores.merge("Alice", 5, (oldValue, newValue) -> (oldValue + newValue) > 95 ? null : oldValue + newValue);

        System.out.println(scores); // {Bob=85}
    }


}
