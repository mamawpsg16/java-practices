package app.api_collections;
import java.util.*;

public class ExtendingCollectionWithList {

    public static void ListExample() {
        // Using ArrayList
//        Accessing a Single Object
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.set(0, "Melon");
        arrayList.remove(1);
//        Finding the Index of an Object
        System.out.println("INDEX OF = APPLE (" + arrayList.indexOf("Melon") +")");
        System.out.println("ArrayList: " + arrayList);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println("ORDERED LIST = " + arrayList);
        System.out.println("Get second element (fast): " + arrayList.get(1));

        // Using LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Elephant");
        linkedList.add("Fox");

        System.out.println("LinkedList: " + linkedList);

        // Adding in the middle (better in LinkedList)
        linkedList.add(1, "Cat");
        System.out.println("LinkedList after insertion: " + linkedList);

        //Getting a SubList
        List<String> strings = new ArrayList<>(List.of("0", "1", "2", "3", "4", "5"));
        System.out.println(strings);
        strings.subList(2, 5).clear(); //GET SUBLIST EXCLUDING THE END INDEX
        System.out.println(strings);

        // Iterating over the Elements of a List using ListIterator
        List<String> numbers = Arrays.asList("one", "two", "three");
        for (ListIterator<String> iterator = numbers.listIterator(); iterator.hasNext();) {
            String nextElement = iterator.next();
            if (Objects.equals(nextElement, "two")) {
                iterator.set("2");
            }
        }
        System.out.println("numbers = " + numbers);

        //Exploring the Set Interface
        List<String> setStrings = List.of("one", "two", "three", "four", "five", "six");
        Set<String> set = new HashSet<>();
        set.addAll(setStrings);
        set.forEach(System.out::println);

        //Extending Set with SortedSet
        SortedSet<String> stringsV3 = new TreeSet<>(Set.of("a", "b", "c", "d", "e", "f"));
        stringsV3.add("NEW");
        System.out.println("headSet V1 = " + stringsV3.headSet("d"));
        System.out.println("tailSet V1= " + stringsV3.tailSet("e"));
        SortedSet<String> subSet = stringsV3.subSet("aa", "d");
        System.out.println("First = " + stringsV3.first());
        System.out.println("Last = " + stringsV3.last());
        System.out.println("Last = " + stringsV3.getFirst());
        System.out.println("Last = " + stringsV3.getLast());
        System.out.println("sub set = " + subSet);
        System.out.println("stringsV3 = " + stringsV3);

        //Extending SortedSet with NavigableSet
        // Creating a TreeSet (which implements NavigableSet)
        NavigableSet<Integer> numbersV2 = new TreeSet<>();

        // Adding elements
        numbersV2.add(10);
        numbersV2.add(20);
        numbersV2.add(30);
        numbersV2.add(40);
        numbersV2.add(50);

        // Finding elements
//        "What's the next biggest number (or equal)?"
        System.out.println("Ceiling of 25: " + numbersV2.ceiling(25)); // 30
//        "What's the next smallest number (or equal)?"
        System.out.println("Floor of 25: " + numbersV2.floor(25)); // 20
//        "What's the first number strictly bigger?"
        System.out.println("Higher than 30: " + numbersV2.higher(30)); // 40
//        "What's the first number strictly smaller?"
        System.out.println("Lower than 30: " + numbersV2.lower(30)); // 20

        // Subset with inclusive limit
        System.out.println("HeadSet (elements < 30): " + numbersV2.headSet(30, true)); // [10, 20, 30]

        // Polling first and last elements
//        Retrieves and removes the smallest element (first element) → 10 - The set now becomes: [20, 30, 40, 50]
        System.out.println("Poll first: " + numbersV2.pollFirst()); // 10
//        Retrieves and removes the largest element (last element) → 50 - The set now becomes: [20, 30, 40].
        System.out.println("Poll last: " + numbersV2.pollLast()); // 50
//        After removing 10 (first) and 50 (last), the remaining set is
        System.out.println("Set after polling: " + numbersV2); // [20, 30, 40]

        // Iterating in descending order
        System.out.println("Descending set: " + numbersV2.descendingSet()); // [40, 30, 20]

        // Get descending iterator
        Iterator<Integer> descendingIterator = numbersV2.descendingIterator();

        // Iterate in reverse order
        System.out.print("Numbers in descending order: ");
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
    }
}
