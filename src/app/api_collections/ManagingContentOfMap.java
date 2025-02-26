package app.api_collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ManagingContentOfMap {
    public static void addKeyValueToMap(){
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", null);
        map.put("three", 3);
        map.put("four", null);
        map.put("five", 5);
        map.putIfAbsent("six", 6);

//        replaces the faulty null values with a default value, -1
        for (String key : map.keySet()) {
            map.putIfAbsent(key, -1);
        }
        System.out.println("Remove Five Value = "+ map.remove("five"));
        System.out.println("Remove Five Value = "+ map.remove("five", 6));

        for (Integer value : map.values()) { // Use Integer instead of int
            System.out.println("value = " + value);
        }
    }

    public static void getValueFromKey(){
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        List<String> values = new ArrayList<>();
        for (int key = 0; key < 5; key++) {
            values.add(map.getOrDefault(key,"UNDEFINED"));
        }
        System.out.println("values = " + values);

        //Using STREAMS
        List<String> values2 =
                IntStream.range(0, 5)
                        .mapToObj(key -> map.getOrDefault(key, "UNDEFINED"))
                        .collect(Collectors.toList());

        System.out.println("STREAM values = " + values2);

    }
}
