package app.api_collections;

import java.util.*;

public class KeepingKeysSortedWithSortedMapAndNavigableMap {
    public static void sortedMapExample(){
        SortedMap<Integer, String> students = new TreeMap<>();
        students.put(101, "Alice");
        students.put(105, "Bob");
        students.put(107, "David");
        students.put(103, "Charlie");

        System.out.println("First Key: " + students.firstKey());  // 101
        System.out.println("Last Key: " + students.lastKey());    // 107
        System.out.println("Head Map (before 105): " + students.headMap(105));  // {101=Alice, 103=Charlie}
        System.out.println("Tail Map (from 105): " + students.tailMap(105));  // {105=Bob, 107=David}
        System.out.println("Sub Map (103 to 107): " + students.subMap(103, 107));  // {103=Charlie, 105=Bob}
    }

    public static void navigableMapExample(){
        NavigableMap<Integer, String> employees = new TreeMap<>();
        employees.put(1001, "Alice");
        employees.put(1003, "Bob");
        employees.put(1005, "Charlie");
        employees.put(1007, "David");

        System.out.println("Lower Key (before 1005): " + employees.lowerKey(1005));  // 1003
        System.out.println("Floor Key (1005 or before): " + employees.floorKey(1005));  // 1005
        System.out.println("Ceiling Key (1005 or after): " + employees.ceilingKey(1005));  // 1005
        System.out.println("Higher Key (after 1005): " + employees.higherKey(1005));  // 1007

        System.out.println("First Entry: " + employees.firstEntry());  // 1001=Alice
        System.out.println("Last Entry: " + employees.lastEntry());    // 1007=David

        // Reverse Order
        System.out.println("Descending Map: " + employees.descendingMap());

        // Removing first and last entries
        System.out.println("Poll First Entry: " + employees.pollFirstEntry());
        System.out.println("Poll Last Entry: " + employees.pollLastEntry());
        System.out.println("Updated Map: " + employees);
    }
}
