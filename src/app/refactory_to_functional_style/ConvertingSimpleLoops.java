package app.refactory_to_functional_style;

import java.util.stream.IntStream;
import java.util.List;

public class ConvertingSimpleLoops {
    public static void simpleLoops(){
        System.out.println("Imperative Style Loop");
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("Functional Style Loop Excluding Ending Value");
        // loop runs to excluding the ending value
        IntStream.range(0, 5).forEach(i -> System.out.println(i));
        // loop runs to excluding the ending value
        IntStream.range(0, 5).forEach(System.out::println);
        System.out.println("Functional Style Loop Include Ending Value");
        // loop runs to include the ending value
        IntStream.rangeClosed(0, 5).forEach(System.out::println);
    }

    public static void iteratingWithSteps(){
        System.out.println("Imperative Style Iterating with Steps");
        for(int i = 0; i < 15; i = i + 3) {
            System.out.println(i);
        }

        System.out.println("Functional Style Iterating with Steps");
//        0 (seed) → The first element in the sequence (equivalent to int i = 0 in a for loop).
//        i -> i < 15 (predicate) → A condition that decides whether to continue generating elements (i < 15 in the for loop).
//        i -> i + 3 (next function) → Defines how the next element is computed (i += 3 in the for loop).

        IntStream.iterate(0, i -> i < 15, i -> i + 3)
                .forEach(System.out::println);
    }

    public static void unboundedIterationWithBreak(){
        System.out.println("Imperative Style Iteration with Break and Steps");
        for(int i = 0;; i = i + 3) {
            if(i > 20) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("Functional Style Iteration with Break and Steps");
        IntStream.iterate(0, i -> i + 3)
                .takeWhile(i -> i <= 20)
                .forEach(System.out::println);
    }

    public static void iteratingWithForeach(){
        System.out.println("Imperative Style Iterating with Foreach");
        List<String> names = List.of("Jack", "Paula", "Kate", "Peter");

        for(String name: names) {
            System.out.println(name);
        }

        System.out.println("Functional Style Iterating with Foreach");
//        names.forEach(System.out::println);
        names.forEach(name -> System.out.println(name));

        System.out.println("Functional Style Iterating Stream with Foreach");
        names.stream().forEach(name -> System.out.println(name));
//        names.stream().forEach(System.out::println);

        System.out.println("Imperative Style Iterating with Foreach Picking elements with IF");
        for(String name: names) {
            if(name.length() == 4) {
                System.out.println(name);
            }
        }
        System.out.println("Functional Style Iterating with Foreach Picking elements with IF");
        names.stream().filter(name -> name.length() == 4).forEach(name -> System.out.println(name));
    }

    public static void convertingIterationWithTransformation(){
        System.out.println("Imperative Style Iteration with Transformation");
        List<String> names = List.of("Jack", "Paula", "Kate", "Peter");

        for(String name: names) {
            System.out.println(name.toUpperCase());
        }

        System.out.println("Functional Style Iteration with Transformation");
        names.stream().map(name -> name.toUpperCase()).forEach(nameInUpperCase -> System.out.println(nameInUpperCase));

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("Imperative Style Iteration with Transformation With IF Statement");
        for(String name: names) {
            if(name.length() == 4) {
                System.out.println(name.toUpperCase());
            }
        }

        System.out.println("Functional Style Iteration with Transformation With IF Statement");
        names.stream()
                .filter(name -> name.length() == 4)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

}
