package app.api_collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class IteratingOverCollections {
    public static void example(){
        /* This pattern is very efficient, as long as you only need to read the elements of your collection */
        Collection<String> strings = List.of("one", "two", "three");
        System.out.println("EFFICIENT FOR ONLY READING ELEMENTS");
        for (String element: strings) {
            System.out.println(element);
        }

        System.out.println("USING ITERATOR PATTERN");
        /* Using an Iterator on a Collection */
        // - The Iterator pattern allows to remove some of the elements of your collection while you are iterating over them
        Collection<String> stringsV1 = List.of("one", "two", "three", "four");
        for (Iterator<String> iterator = stringsV1.iterator(); iterator.hasNext();) {
            String element = iterator.next();
            if (element.length() == 3) {
                System.out.println(element);
            }
        }

        System.out.println("UPDATING COLLECTION WHILE ITERATING OVER IT");
        Collection<String> stringsV2 = new ArrayList<>();
        stringsV2.add("one");
        stringsV2.add("two");
        stringsV2.add("three");

        //FIRST
        Iterator<String> iterator = stringsV2.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
//            stringsV2.remove(element); //ERROR
//            iterator.remove();  // Safe removal

        }
        //SECOND
        stringsV2.removeIf(e -> true);  // Removes all elements safely

        System.out.println(stringsV2);
    }
}
