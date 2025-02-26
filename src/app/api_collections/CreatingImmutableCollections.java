package app.api_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Map;
import java.util.Arrays;
import java.util.Comparator;

public class CreatingImmutableCollections {
    public static void immutableCollectionExample(){
        List<String> immutableList = List.of("Apple", "Banana", "Cherry");
        Set<String> immutableSet = Set.of("Cat", "Dog", "Elephant");
        Map<Integer, String> immutableMap = Map.of(1, "One", 2, "Two", 3, "Three");

        System.out.println("immutableList = "+immutableList);
        System.out.println("immutableSet = " +immutableSet);
        System.out.println("immutableMap = " +immutableMap);

        // immutableList.add("Mango"); // This will throw UnsupportedOperationException
    }

    public static void unmodifiableCollectionExample() {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Red");
        mutableList.add("Green");
        mutableList.add("Blue");

        List<String> immutableList = Collections.unmodifiableList(mutableList);

        List<String> strings = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4"));
        List<String> immutableStrings = Collections.unmodifiableList(strings);
        System.out.println(immutableStrings);
        System.out.println("immutableStrings V1= " + immutableStrings);

        strings.add("5");
        System.out.println("immutableStrings V2= " + immutableStrings);

        System.out.println("immutableList Created from Mutable List = "+immutableList);


        // immutableList.add("Yellow"); // This will throw UnsupportedOperationException
    }

    public static void arrayToListExample() {
        String[] array = {"Java", "Python", "C++"};
        List<String> list = Arrays.asList(array);

        System.out.println(list);

        list.set(0, "JavaScript"); // Allowed because it's backed by the array
        System.out.println(list);

        // list.add("Ruby"); // This will throw UnsupportedOperationException
    }

    public static void changeOrderOfList(){
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        // Sorting in ascending order
        numbers.sort(null); // Equivalent to Collections.sort(numbers)
        System.out.println("Sorted (Ascending): " + numbers);

        // Sorting in descending order
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Sorted (Descending): " + numbers);
    }

    public static void shuffleExample() {
        List<String> items = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Date"));

        Collections.shuffle(items);
        System.out.println("Shuffled List: " + items);

        Collections.shuffle(items, new Random(42)); // Using a fixed seed for reproducibility
        System.out.println("Shuffled with Random(42): " + items);
    }

    public static void rotateExample() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Collections.rotate(numbers, 2); // Rotating forward by 2 positions
        System.out.println("Rotated List (+2): " + numbers);

        Collections.rotate(numbers, -1); // Rotating backward by 1 position
        System.out.println("Rotated List (-1): " + numbers);
    }

    public static void reverseExample() {
        List<Character> letters = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));

        Collections.reverse(letters);
        System.out.println("Reversed List: " + letters);
    }

    public static void swapExample() {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        Collections.swap(names, 0, 2); // Swapping first and last element
        System.out.println("Swapped List: " + names);
    }
}
