package app.api_collections;

import java.util.*;
import java.util.function.Predicate;

public class CollectionInterface {

    public static void example(){
        //EXAMPLE #1
        Collection<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");
        System.out.println("strings = " + strings);
        strings.remove("one");
        System.out.println("strings = " + strings);

        //EXAMPLE #2
        Collection<String> stringsV1 = new ArrayList<>();
        stringsV1.add("one");
        stringsV1.add("two");
        if (stringsV1.contains("one")) {
            System.out.println("one is here");
        }
        if (!stringsV1.contains("three")) {
            System.out.println("three is not here");
        }

        User rebecca = new User("Rebecca");
        if (!stringsV1.contains(rebecca)) {
            System.out.println("Rebecca is not here");
        }

        /* CHECK IF STRINGSV2 CONTAINS ANOTHER COLLECTION VALUES*/
        Collection<String> stringsV2 = new ArrayList<>();
        stringsV2.add("one");
        stringsV2.add("two");
        stringsV2.add("three");

        Collection<String> first = new ArrayList<>();
        first.add("one");
        first.add("two");

        Collection<String> second = new ArrayList<>();
        second.add("one");
        second.add("four");

        System.out.println("Is first contained in strings? " + stringsV2.containsAll(first));
        System.out.println("Is second contained in strings? " + stringsV2.containsAll(second));

        /* ADD THE COLLECTION IN ANOTHER COLLECTION WORKS LIKE CONCAT OR JOIN*/
        Collection<String> stringsV3 = new ArrayList<>();
        stringsV3.add("one");
        stringsV3.add("two");
        stringsV3.add("three");

        Collection<String> firstV1 = new ArrayList<>();
        firstV1.add("one");
        firstV1.add("four");

        boolean hasChanged = stringsV3.addAll(firstV1);

        System.out.println("Has strings changed? " + hasChanged);
        System.out.println("strings = " + stringsV3);

        /* REMOVE THE VALUES THAT EXIST IN THE ANOTHER COLLECTION */
        Collection<String> toBeRemovedV1 = new ArrayList<>();
        toBeRemovedV1.add("one");
        toBeRemovedV1.add("four");

        boolean hasBeenRemoved = stringsV3.removeAll(toBeRemovedV1);

        System.out.println("Has strings removed? " + hasBeenRemoved);
        System.out.println("strings = " + stringsV3);

        /* RETAIN THE VALUES IF ALREADY EXIST IN THE MAIN COLLECTION */
        Collection<String> toBeRetained = new ArrayList<>();
        toBeRetained.add("three");

        boolean hasChangedV1 = stringsV3.retainAll(toBeRetained);

        System.out.println("Has strings changed? " + hasChangedV1);
        System.out.println("strings = " + stringsV3);

        System.out.println("SIZE = " + stringsV3.size());
        System.out.println("IS STRINGV3 EMPTY ? " + stringsV3.isEmpty());
        stringsV3.clear();
        System.out.println("CLEAR COLLECTION, SIZE NOW = " + stringsV3.size());

        /* Getting an Array of the Elements of a Collection */
        Collection<String> names = new ArrayList<>();
        names.add("Kevin");
        names.add("Kenneth");

        String[] tabString1 = names.toArray(new String[] {});
        names.stream().forEach(System.out::println);
        String[] tabString2 = names.toArray(new String[15]);   // or an array of the right size

        Collection<String> stringsV4 = List.of("one", "two");

        String[] largerTab = {"three", "three", "three", "I", "was", "there"};
        System.out.println("largerTab = " + Arrays.toString(largerTab));

        String[] result = stringsV4.toArray(largerTab);
        System.out.println("result = " + Arrays.toString(result));

        System.out.println("Same arrays? " + (result == largerTab));

        /* Filtering out Elements of a Collection with a Predicate */
        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);

        Collection<String> stringsV5 = new ArrayList<>();
        stringsV5.add(null);
        stringsV5.add("");
        stringsV5.add("one");
        stringsV5.add("two");
        stringsV5.add("");
        stringsV5.add("three");
        stringsV5.add(null);

        System.out.println("strings = " + stringsV5);
        stringsV5.removeIf(isNullOrEmpty);
        System.out.println("filtered strings = " + stringsV5);


    }
}
