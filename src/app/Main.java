package app;

//import app.generics.Util;
//import app.generics.Pair;

import app.api_collections.CollectionInterface;
import app.api_collections.CreatingImmutableCollections;
import app.api_collections.ExtendingCollectionWithList;
import app.api_collections.HandlingMapValuesWithLambda;
import app.api_collections.IteratingOverCollections;
import app.api_collections.KeepingKeysSortedWithSortedMapAndNavigableMap;
import app.api_collections.ManagingContentOfMap;
import app.api_collections.StoreElementsInStackAndQueues;
import app.api_collections.UsingMapsKeyValuePair;
import app.date_time.ClockClass;
import app.date_time.DateClass;
import app.date_time.DateTimeClass;
import app.date_time.DayOfWeekAndMonthEnums;
import app.date_time.InstantClass;
import app.date_time.LegacyDateTimeCode;
import app.date_time.LocalDateAndTImeClass;
import app.date_time.ParsingAndFormatting;
import app.date_time.PeriodDuration;
import app.date_time.StandardCalendar;
import app.date_time.TemporalPackage;
import app.date_time.TimezoneAndOffset;
import app.exceptions.CatchHandling;
import app.exceptions.ChainedException;
import app.exceptions.CustomException;
import app.exceptions.CustomExceptionExample;
import app.exceptions.Error;
import app.exceptions.ExceptionExample;
import app.exceptions.StackTrace;
import app.exceptions.ThrowExceptions;
import app.input_output.FileIOExample;
import app.lambda.functional_interfaces.*;
import app.lambda.functional_interfaces.method_references.*;
import app.lambda.writing_comparators.Person;
import app.exceptions.Throwable;
import app.refactory_to_functional_style.ConvertingSimpleLoops;
import app.refactory_to_functional_style.ReadingExternalResource;

import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//
//        String firstString = "This is";
//        String secondString = " a concatenated string.";
//        String thirdString = firstString + secondString;
//        System.out.println(thirdString);
//
//        System.out.println(GenerateMessage.generateMessage());
//        System.out.println(AnotherMessage.generateAnotherMessage());
//
//        Example obj = new Example(); // ✅ Create an instance
//        obj.nonStaticMethod(); // ✅ Now call the non-static method
//
//        var  scannerExample = new ScannerExample();
//        scannerExample.scan();
//        scannerExample.introduce();
          /* ARRAY */
//        ArrayDemo array = new ArrayDemo();
//        array.arrayInitialization();
//        array.copyArray();
//        array.printList();
//
//        MultiDimensional multiDimensional = new MultiDimensional();
//        multiDimensional.showNames();
//        ControlFlow controlFlow = new ControlFlow();
//
//        controlFlow.ifStatement();
//        controlFlow.whileStatement();
//        controlFlow.doWhileStatement();
//        controlFlow.forStatement();
//        controlFlow.switchStatement();
//        controlFlow.unlabeledBreakStatement();
//        controlFlow.labeledBreakStatement();
//        controlFlow.unlabeledContinueStatement();
//        controlFlow.labeledContinueStatement();
//        controlFlow.yieldStatement();

//        int result = controlFlow.yieldStatementCalculate(Day.WEDNESDAY);
//        System.out.println("Result: " + result);

        /* CLASS */
//        Bike bike1 = new Bike( "Normal Bike");
//        System.out.println(Bike.numberOfBicycles);
//        System.out.println(Bike.PI);
//
//        // Invoke methods on
//        // those objects
//        bike1.changeCadence(50);
//        bike1.speedUp(10);
//        bike1.applyBrakes(1);
//        bike1.changeGear(2);
//        bike1.printStates();
//
//        bike2.changeCadence(50);
//        bike2.speedUp(10);
//        bike2.changeGear(2);
//        bike2.changeCadence(40);
//        bike2.speedUp(10);
//        bike2.changeGear(3);
//        bike2.printStates();
//
//        MountainBike mtb = new MountainBike("Mountain Bike", "2025", 10);
//        mtb.changeCadence(60);
//        mtb.changeGear(4);
//        mtb.speedUp(20);
//        mtb.applyBrakes(5);
//        mtb.setSeatHeight(12);
//        mtb.printStates();
//        mtb.getCadence();
//        mtb.printNormalBikeState();


//        AcmeBicycle myBike = new AcmeBicycle();
//        myBike.changeGear(3);
//        myBike.speedUp(10);
//        myBike.applyBrakes(3);
//        myBike.displayState();
//        myBike.honk();
//        System.out.println(Bicycle.addSpeed(25, 23));
//
//        OverloadingMethodsAndMore overloadAndMore = new OverloadingMethodsAndMore();
//        overloadAndMore.draw(143);
//        overloadAndMore.draw("Hello World");
//        overloadAndMore.draw(123, "John Doe");

        /* ARBITRARY ARGUMENTS**/
//        Point[] pointsArray = { new Point(1, 2), new Point(3, 4) };
//
//        Polygon.polygonFromArray(pointsArray);
//        Polygon.polygonFromVarargs(new Point(5, 6), new Point(7, 8));
//        Polygon.polygonFromVarargs(pointsArray);
//        Polygon.polygonFromVarargs();

        /* PASSED BY REFERENCE*/
//        Person person = new Person("Alice");
//        Test test  = new Test();
//        test.changeName(person);
//        person.getName();

        /* DEMO OBJECTS */
        // Declare and create a point object and two rectangle objects.
//        ObjectPoint originOne = new ObjectPoint(23, 94);
//        originOne.display("Hello WOrld");
//        ObjectRectangle rectOne = new ObjectRectangle(originOne, 100, 200);
//        ObjectRectangle rectTwo = new ObjectRectangle(50, 100);
//
//        // display rectOne's width, height, and area
//        System.out.println("Width of rectOne: " + rectOne.width);
//        System.out.println("Height of rectOne: " + rectOne.height);
//        System.out.println("Area of rectOne: " + rectOne.getArea());
//
//        // set rectTwo's position
//        rectTwo.origin = originOne;
//
//        // display rectTwo's position
//        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
//        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
//
//        // move rectTwo and display its new position
//        rectTwo.move(40, 72);
//        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
//        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);

        /* STATIC INITIALIZATION BLOCK */
//        System.out.println("App Name: " + StaticInitialization.settings.get("app_name") + "Value = " + StaticInitialization.value);
        // Reset settings (calling the static method again)
//        StaticInitialization.resetSettings();
//        System.out.println("App Name after reset: " + StaticInitialization.settings.get("app_name") + "Value = " + StaticInitialization.value);

        /* DATASTRUCTURE */
//        DataStructure dataStructure = new DataStructure();
//        dataStructure.printEven();

        /* LOCAL CLASS */
//        LocalClassExample localClass = new LocalClassExample();
//        localClass.outerMethod();

        /* ANONYMOUS CLASS */
//        AnonymousClassExample dog = new AnonymousClassExample() {  // Anonymous class
//            @Override
//            public void makeSound() {
//                System.out.println("Woof Woof!");
//            }
//        };
//        dog.makeSound();

        /* ENUM */

        // EXAMPLE # 1
//        EnumDayOfWeek weekStart = EnumDayOfWeek.MONDAY;
//
//        if (weekStart == EnumDayOfWeek.THURSDAY) {
//            System.out.println("The week starts on Monday.");
//        }else{
//            System.out.println("Nope.");
//        }

        // EXAMPLE #2
//        EnumDayOfWeek someDay = EnumDayOfWeek.FRIDAY;
//        switch (someDay) {
//            case MONDAY ->
//                    System.out.println("The week just started.");
//            case TUESDAY, WEDNESDAY, THURSDAY ->
//                    System.out.println("We are somewhere in the middle of the week.");
//            case FRIDAY ->
//                    System.out.println("The weekend is near.");
//            case SATURDAY, SUNDAY ->
//                    System.out.println("Weekend");
//            default ->
//                    throw new AssertionError("Should not happen");
//        }

        //EXAMPLE #3
//        EnumDayOfWeek someDay = EnumDayOfWeek.TUESDAY;
//        String text = switch (someDay) {
//            case MONDAY -> "The week just started.";
//            case TUESDAY, WEDNESDAY, THURSDAY -> "We are somewhere in the middle of the week.";
//            case FRIDAY -> "The weekend is near.";
//            case SATURDAY, SUNDAY -> "Weekend";
//        };
//        System.out.println(text);

//        EnumDayOfWeek day = EnumDayOfWeek.MONDAY;
//        System.out.println(day.getAbbreviation());

        // SPECIAL METHODS
//        System.out.println(EnumDayOfWeek.MONDAY.name());    // prints "MONDAY"
//        System.out.println(EnumDayOfWeek.MONDAY.ordinal()); // prints "0" because MONDAY is the first constant in the DayOfWeek enum

//        EnumDayOfWeek[] days = EnumDayOfWeek.values(); // all days of the week
//        EnumDayOfWeek monday = EnumDayOfWeek.valueOf("MONDAY");
//        for (var d : days){
//            System.out.println(d);
//        }
//        System.out.println(monday);
//        EnumDayOfWeek.compareDayOfWeek(monday);

//        AbstractEnumDayOfWeek day = AbstractEnumDayOfWeek.MONDAY;
//        System.out.println(day.getMessage());

        /* RECORD IMMUTABLE CLASS */
//        PersonRecordImmutable p = new PersonRecordImmutable("Alice", 30);
//
//        System.out.println(p.getClass());          // class RecordImmutable
//        System.out.println(p.getClass().getSuperclass()); // class java.lang.Record
//        System.out.println("Name = " + p.name());
//        System.out.println("Age = " + p.age());
//
//        ProductRecordImmutable a = new ProductRecordImmutable("Firefly Handfan");
//        ProductRecordImmutable b = new ProductRecordImmutable("Firefly Mirror", 2000);
//        System.out.println("Product Name = " + a.name() + " Product Price = " + a.price());
//        System.out.println("Product Name = " + b.name() + " Product Price = " + b.price());

        /* NUMBER AND STRINGS */
//        final String FPATH = "/home/user/index.html";
//        NumberAndStrings.Filename myHomePage = new NumberAndStrings.Filename(FPATH, '/', '.');
//        System.out.println("Extension = " + myHomePage.extension());
//        System.out.println("Filename = " + myHomePage.filename());
//        System.out.println("Path = " + myHomePage.path());
//
//        String searchMe = "Green Eggs and Ham";
//        String findMe = "Eggs";
//        int searchMeLength = searchMe.length();
//        int findMeLength = findMe.length();
//        boolean foundIt = false;
//        for (int i = 0; i <= (searchMeLength - findMeLength); i++) {
//            if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
//                foundIt = true;
//                System.out.println(searchMe.substring(i, i + findMeLength));
//                break;
//            }
//        }
//        if (!foundIt)
//            System.out.println("No match found.");

        // STRING BUILDER
        // creates empty builder, capacity 16
//        StringBuilder sb = new StringBuilder();
        // adds 9 character string at beginning
//        sb.append("Greetings");
//        System.out.println(sb.length() + " " + sb.capacity());

        // MANUAL PALINDROME
//        String palindrome = "Dot saw I was Tod";
//        int len = palindrome.length();
//        char[] tempCharArray = new char[len];
//        char[] charArray = new char[len];

        // put original string in an
        // array of chars
//        for (int i = 0; i < len; i++) {
//            tempCharArray[i] =
//                    palindrome.charAt(i);
//        }

        // reverse array of chars
//        for (int j = 0; j < len; j++) {
//            charArray[j] =
//                    tempCharArray[len - 1 - j];
//        }
//
//        String reversePalindrome =
//                new String(charArray);
//        System.out.println(reversePalindrome);

        // PALINDROME WITH STRING BUILDER
//        String palindrome1 = "Dot saw I was Tod";
//
//        StringBuilder sb1 = new StringBuilder(palindrome1);
//
//        sb1.reverse();  // reverse it
//
//        System.out.println(sb1);

        /* INHERITANCE */
//        OverridingAndHidingMethods.Cat myCat = new OverridingAndHidingMethods.Cat();
//        OverridingAndHidingMethods.Animal myAnimal = myCat;
//        OverridingAndHidingMethods.Animal.testClassMethod();
//        myAnimal.testInstanceMethod();

//        Pegasus myApp = new Pegasus();
//        System.out.println(myApp.identifyMyself());

//        Subclass subClass = new Subclass();
//        subClass.printMethod();
//
//        AbstractExample abstractExample = new AbstractExample("Dawg");
//        abstractExample.makeSound();
//        abstractExample.sleep();

        /* LAMBDA  (parameters) -> { body } */
//        MathOperation add = (a, b) -> a + b;
//        LambdaCalculate lambda = new LambdaCalculate();
//        System.out.println(lambda.calculate(10, 20, add));

        /* GENERICS */
//        GenericsExample generic = new GenericsExample();
//        generic.sampleGeneric();
//        generic.sampleNotGeneric();
//
//        Box<Integer> intBox = new Box<>();  // Box for Integer
//        intBox.setValue(10);
//        System.out.println(intBox.getValue());
//
//        Box<String> strBox = new Box<>();   // Box for String
//        strBox.setValue("Hello");
//        System.out.println(strBox.getValue());
//
//        Util.print(100);       // Works with Integer
//        Util.print("Hello");   // Works with String
//        Util.print(5.5);       // Works with Double

//        Printable<String> strPrinter = new Printer<>();
//        strPrinter.print("Hello World!");
//
//        Printable<Integer> intPrinter = new Printer<>();
//        intPrinter.print(123);

//        NumericBox<Integer> intBox = new NumericBox<>(10);
//        System.out.println(intBox.getDoubleValue());
//
//        NumericBox<Double> doubleBox = new NumericBox<>(5.5);
//        System.out.println(doubleBox.getDoubleValue());
        // NumericBox<String> strBox = new NumericBox<>("Hello");  // ❌ Compile error

//        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
//        List<String> strList = Arrays.asList("Apple", "Banana", "Cherry");
//        // Calling printList method from WildcardExample
//        WildcardExample.printList(intList);
//        WildcardExample.printList(strList);

//        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
//        System.out.println(p1.getKey());
//        Pair<String, String>  p2 = new OrderedPair<String, String>("hello", "world");
//        System.out.println(p2.getValue());

        // PAIR
//        Pair<Integer, String> p1 = new Pair<>(1, "apple");
//        Pair<Integer, String> p2 = new Pair<>(2, "pear");
//        boolean same1 = Util.<Integer, String>compare(p1, p2);
//        boolean same2 = Util.compare(p1, p2);
//        System.out.println(same1);
//        System.out.println(same2);

        // BOUND TYPE
//        BoxBoundType<Integer> intBox = new BoxBoundType<>();  // Valid
//        BoxBoundType<Double> doubleBox = new BoxBoundType<>(); // Valid
//        intBox.set(1);
//        System.out.println(intBox.get());
//        doubleBox.set(5.0);
//        System.out.println(doubleBox.get());


        /* TYPE INFERENCE */
        //BEFORE
//        List<String> list = new ArrayList<String>();
        // AFTER
//        List<String> list = new ArrayList<>();

//        var result = TypeInference.Util.getValue(100); // Compiler infers Integer
//        System.out.println(result); // 100

        /* WILD CARDS */
        //UPPER BOUNDED
//        List<Integer> intList = Arrays.asList(1, 2, 3);
//        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
//
//        System.out.println(UpperBounded.sumOfList(intList)); // Output: 6.0
//        System.out.println(UpperBounded.sumOfList(doubleList)); // Output: 7.5
//
        //UNBOUNDED
//        List<Integer> intList = List.of(1, 2, 3);
//        List<String> strList = List.of("A", "B", "C");
//
//        Unbounded.printList(intList); // Works
//        Unbounded.printList(strList); // Works
//
        //LOWER BOUNDED
//        List<Number> numberList = new ArrayList<>();
//        LowerBounded.addNumbers(numberList); // Works since Number is a superclass of Integer
//
//        List<Object> objectList = new ArrayList<>();
//        LowerBounded.addNumbers(objectList); // Works since Object is a superclass of Integer
//
//        System.out.println(numberList); // Output: [10, 20]
//        System.out.println(objectList); // Output: [10, 20]

        /* UTILITIES */
//        Utilities.arrayExample();
//        Utilities.listExample();
//        Utilities.setExample();
//        Utilities.mapExample();

        /* TRY CATCH */
//        TryCatchExample tryCatchExample = new TryCatchExample();

        /* THROW */
//        ThrowExample.validateAge(18);
//        ThrowExample.validateAge(17);

        /* THROWS */
//        try {
//            ThrowsExample.checkFile();
//        } catch (IOException e) {
//            System.out.println("Caught: " + e.getMessage());
//        }

        /* FILE HANDLING */
        //READ
//        ReadFileExample.read("test.txt");

        //WRITE & READ
//        WriteFileExample.write();
//        ReadFileExample.read("output.txt");

        /* THREADS & CONCURRENCY */
        //Creating a Thread using Runnable
//        Thread thread = new Thread(new RunnableExample()); // Runnable passed to Thread
//        thread.start(); // Starts the thread

        //Creating a Thread using Thread Class
//        ThreadExample thread1 = new ThreadExample(); // Directly creating a thread object
//        thread1.start();

        //Use Thread With Join To Wait for the Thread
//        ThreadJoin threadJoin = new ThreadJoin();
//        threadJoin.start();

        // TO MAKE THE MAIN THREAD WAIT THE CREATED THREAD
//        try {
//            threadJoin.join();  // Wait for t to finish
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Main thread resumes after it finishes.");

        /* GENERICS RESTRCTIONS */

//        StudentsDetails<int, character> p = new StudentsDetails<>(9,'a'); //ERROR AS int and character is not reference type
//        StudentsDetails<Integer, String> students = new StudentsDetails<>();
//        students.put(1, "Kevin"); // WILL BE OVERRIDEN OF THE KENNETH DATA
//        students.put(1, "Kenneth");
//        students.put(2, "Rojenson");
//        students.getStudents();

        /* LAMBDA */
        // EXAMPLE #1
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//
//        numbers.stream()
//                .filter(n -> n % 2 == 0) // Keep even numbers
//                .forEach(n -> System.out.println(n));

        // EXAMPLE #2
//        List<String> names = Arrays.asList("John", "Alice", "Bob");
//
//        Collections.sort(names, (a, b) -> a.compareTo(b));
//
//        System.out.println(names);

//        MyFunction myLambda = () -> System.out.println("Hello, Lambda!");
//        myLambda.sayHello(); // Calls the lambda function

//        A lambda expression must implement the single abstract method of a functional interface.
//        MathOperationLambda addition = (a, b) -> a + b; // Implements operate(a, b)
//        System.out.println(addition.operate(5, 3)); // Output: 8
//
//        StringManipulator toUpper = s -> s.toUpperCase();
//        System.out.println(toUpper.manipulate("hello"));

        //Capturing Local Values (Effectively Final Variables)
//        int factor = 2; // Must be effectively final
//        MathOperationLambda multiply = (a, b) -> a * b * factor;
//        System.out.println(multiply.operate(3, 4));

        //Serialization
//        LambdaSerialization.serialize();
//        LambdaSerialization.deserialize();

        //Functional Interface (LAMBDA)

        //SUPPLIER - do not take any argument, return something
//        SupplierExample.supplier();
//
//        Supplier<String> supplier = () -> "Hello Duke! \n";
//        System.out.println(supplier.get());
//
//        Random random = new Random(314L);
//        Supplier<Integer> newRandom = () -> random.nextInt(10);
//
//        for (int index = 0; index < 5; index++) {
//            System.out.println(newRandom.get() + " ");
//        }

        //CONSUMER - take an argument, do not return anything
//        ConsumerExample.consumer();
//        Consumer<String> printer = s -> System.out.println(s);
//        printer.accept("Nice ka Brodie");
//
//        Random randomNumber = new Random();
//        BiConsumer<Random, Integer> randomNumberPrinter =
//                (random, number) -> {
//                    for (int i = 0; i < number; i++) {
//                        System.out.println("next random = " + ( random.nextInt(50) + 1));
//                    }
//                };
//        randomNumberPrinter.accept(randomNumber, 5);

        //PREDICATE -  take an argument, return a boolean
//        Predicate<String> length3 = s -> s.length() == 3;
//        String word = "ABC"; // any word
//        boolean isOfLength3 = length3.test(word);
//        System.out.println("Is of length 3? " + isOfLength3);
//
//        IntPredicate isGreaterThan10 = i -> i > 10;
//        boolean isGreaterThan = isGreaterThan10.test(5);
//        System.out.println("Is Greater than 10 ? " + isGreaterThan);

        //BI-PREDICATE
//        BiPredicate<String, Integer> isOfLength = (word1, len) -> word1.length() == len;
//
//        String word1 = "QWERT";
//        int length = 5;
//
//        boolean isWordOfLength5 = isOfLength.test(word1, length); // Pass both arguments
//        System.out.println(isWordOfLength5); // false (since "QWERTY" has length 6)

        //Passing a Predicate to a Collection
//        PredicateExample.predicate();
//        List<String> immutableStrings = List.of("one", "two", "three", "four", "five");
//        List<String> strings = new ArrayList<>(immutableStrings);
//        Predicate<String> isEvenLength = s -> s.length() % 2 == 0;
//        strings.removeIf(isEvenLength);
//        System.out.println("strings = " + strings);

        //FUNCTION - take an argument, return something
//        FunctionExample.function();
//        Function<String, Integer> toLength = s -> s.length();
//        String word2 = "Hello World"; // any kind of word will do
//        int length1 = toLength.apply(word2);
//        System.out.println("Length of Word2 = " + length1);
//
//        List<String> strings = Arrays.asList("one", "two", "three");
//        UnaryOperator<String> toUpperCase = word3 -> word3.toUpperCase();
//        strings.replaceAll(toUpperCase);
//        System.out.println(strings);

        //FULL EXAMPLE OF FUNCTIONAL INTERFACES
//        FunctionalInterfacesExample.fullExample();

        /* LAMBDA (METHOD REFERENCE) */
        //Writing Static Method References
//        MethodReference.example();
//        StaticMethodReference.example();
//        UnboundMethodReference.example();
//        BoundMethodReference.example();
//        ConstructorMethodReference.example();

        // Combining, Chaining, Composing
//        PredicateChainingExample.example();
//        PredicateFactoryMethodExample.example();
//        ConsumerChainingExample.example();
//        FunctionChainingExample.example();
//        IdentityFunctionExample.example();

        /* WRITING COMPARATORS */
        // Create a list of Person objects
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Alice", 30, 50000.0));
//        people.add(new Person("Bob", 25, null));      // salary is null
//        people.add(new Person("Charlie", 30, 60000.0));
//        people.add(new Person("David", 40, 70000.0));
//        people.add(new Person("Eve", 25, 45000.0));

        // 1. Implementing a Comparator with a Lambda Expression
        // Sorting by age using a lambda expression
//        people.sort((Person p1, Person p2) -> Integer.compare(p1.getAge(), p2.getAge()));
//        System.out.println("Sorted by age using lambda:");
//        people.forEach(System.out::println);

        // 2. Using a Factory Method to Create a Comparator
        // Using Comparator.comparing to create a comparator that sorts by name
//        Comparator<Person> nameComparator = Comparator.comparing(person -> person.getName());
//        people.sort(nameComparator);
//        System.out.println("\nSorted by name using Comparator.comparing:");
//        people.forEach(System.out::println);

        // 3. Chaining Comparators
        // First, sort by age, then by name if ages are equal
//        Comparator<Person> ageThenNameComparator = Comparator
//                .comparing((Person person) -> person.getAge())
//                .thenComparing(person -> person.getName());
//        people.sort(ageThenNameComparator);
//        System.out.println("\nSorted by age then name using chaining:");
//        people.forEach(System.out::println);

        // 4. Specialized Comparators
        // Using Comparator.comparingInt to compare int fields (age) directly
//        people.sort(Comparator.comparingInt(person -> person.getAge()));
//        System.out.println("\nSorted by age using specialized Comparator.comparingInt:");
//        people.forEach(System.out::println);

        // 5. Comparing Comparable Objects Using Their Natural Order
        // Sorting a list of strings that are naturally comparable (alphabetical order)
//        List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");
//        names.sort(Comparator.naturalOrder());
//        System.out.println("\nSorted names using natural order:");
//        names.forEach(System.out::println);

        // 6. Reversing a Comparator
        // Sorting names in reverse alphabetical order using the reversed() method
//        names.sort(Comparator.<String>naturalOrder().reversed());
//        names.sort((s1, s2) -> s2.compareTo(s1));
//        System.out.println("\nSorted names in reverse order:");
//        names.forEach(System.out::println);


        // 7. Dealing with Null Values
        // Sorting people by salary and placing null values first using Comparator.nullsFirst
//        Comparator<Person> salaryComparator = Comparator.comparing(
//                person -> person.getSalary(),
//                Comparator.nullsFirst(Double::compareTo)
//        );
//        people.sort(salaryComparator);
//        System.out.println("\nSorted by salary with nulls first:");
//        people.forEach(System.out::println);

        /* EXCEPTIONS */
        //If an exception occurs in the try block, it is caught in the catch block.
//        CatchHandling.tryCatchExample();
        //We can catch multiple exceptions in a single catch block using | (pipe operator).
//        CatchHandling.multiCatching();
        //The finally block always executes, regardless of whether an exception occurs.
//        CatchHandling.finallyBlock();
        //When working with resources like files, we can use try-with-resources to ensure they are closed automatically.
//        CatchHandling.tryWithResourcesExample();
        //If multiple exceptions occur in try-with-resources, only the primary exception is caught, while others are suppressed.
//        CatchHandling.suppressedExceptionExample();
        //Classes that implement AutoCloseable or Closeable can be used in try-with-resources.
//        CatchHandling.autoCloseableExample();
        //combining everything:
//        CatchHandling.exceptionHandlingExample();

        //THROW EXCEPTIONS

        //Specifying the Exceptions Thrown by a Method (throws Keyword) - If a method can cause an exception that it does not handle,
        // it must specify that exception using the throws keyword.
//        try {
//            ThrowExceptions.readFile();  // Must handle IOException
//        } catch (IOException e) {
//            System.out.println("Exception caught: " + e);
//        }
//
        //How to Throw Exceptions (throw Keyword)
//        try {
//            ThrowExceptions.validateAge(18); // This will throw an exception
//        } catch (IllegalArgumentException e) {
//            System.out.println("Caught exception: " + e.getMessage());
//        }

        //THROWABLE
//        Throwable.example();

        // ERROR CLASS
//        try {
//            Error.recursiveMethod();
//        } catch (StackOverflowError e) {
//            System.out.println("Stack Overflow Error occurred!");
//        }

        //EXCEPTION
//        ExceptionExample.example();

        //CHAINED EXCEPTION

        //These constructors are available in:
        //Exception
        //RuntimeException
        //Error
//        try {
//            ChainedException.method1();
//        } catch (Exception e) {
//            System.out.println("Caught Exception: " + e);
//            System.out.println("Root Cause: " + e.getCause());
//        }

        //STACK TRACE
//        StackTrace.example();

        //CUSTOM EXCEPTION
//        try {
//            CustomExceptionExample.checkValue(-5);
//        } catch (CustomException e) {
//            System.out.println("Caught: " + e.getMessage());
//        }

        /* REFACTORING TO FUNCTIONAL STYLE */
        //SIMPLE LOOPS
//        ConvertingSimpleLoops.simpleLoops();

        //ITERATING WITH STEPS
//        ConvertingSimpleLoops.iteratingWithSteps();

        //UNBOUNDED WITH A BREAK AND STEPS
//        ConvertingSimpleLoops.unboundedIterationWithBreak();

        //ITERATING WITH FOREACH
//        ConvertingSimpleLoops.iteratingWithForeach();

        //ITERATION WITH TRANSFORMATION
//        ConvertingSimpleLoops.convertingIterationWithTransformation();

        //CONVERTING DATA SOURCES TO STREAMS
//        ReadingExternalResource.imperativeStyle();
//        ReadingExternalResource.functionalStyle();

        /* COLLECTIONS */
        //COLLECTION INTERFACE
//        CollectionInterface.example();

        //ITERATING OVER COLLECTIONS WITH ITERATE PATTERN
//        IteratingOverCollections.example();

        /* LISTS */
//        ExtendingCollectionWithList.ListExample();

        /* IMMUTABLE COLLECTIONS*/
//        CreatingImmutableCollections.immutableCollectionExample();
//        CreatingImmutableCollections.arrayToListExample();
//        CreatingImmutableCollections.unmodifiableCollectionExample();
//        CreatingImmutableCollections.changeOrderOfList();
//        CreatingImmutableCollections.shuffleExample();
//        CreatingImmutableCollections.rotateExample();
//        CreatingImmutableCollections.reverseExample();
//        CreatingImmutableCollections.swapExample();

        /* STACKS AND QUEUES */
//        StoreElementsInStackAndQueues.pushPopAndPeeking();
//        StoreElementsInStackAndQueues.queueExample();

        /* MAPS */
//        UsingMapsKeyValuePair.mapExample();
//        UsingMapsKeyValuePair.mapFactoryExample();
//        UsingMapsKeyValuePair.mapMethodsExample();

        //Managing the Content of a Map
//        ManagingContentOfMap.addKeyValueToMap();
//        ManagingContentOfMap.getValueFromKey();

        //Handling Map Values with Lambda
//        HandlingMapValuesWithLambda.example();
//        HandlingMapValuesWithLambda.computeExample();
//        HandlingMapValuesWithLambda.computeIfAbsentExample();
//        HandlingMapValuesWithLambda.computeIfPresentExample();
//        HandlingMapValuesWithLambda.mergeExample();
//        HandlingMapValuesWithLambda.mergeWithNullExample();

        //Keeping Keys Sorted With SortedMap And NavigableMap
//        KeepingKeysSortedWithSortedMapAndNavigableMap.sortedMapExample();
//        KeepingKeysSortedWithSortedMapAndNavigableMap.navigableMapExample();

        /* INPUT OUTPUT */
//        FileIOExample.readingWritingText();
//        FileIOExample.pathExample();

        /* DATETIME */
//        DateTimeClass.localDateExample();
//        DateTimeClass.localDateTimeExample();
//        DateTimeClass.zonedAndOffsetDateTimeExample();
//        DateTimeClass.nonIsoCalendarExample();

        //STANDARD CALENDAR
//        StandardCalendar.example();

        // DAY OF WEEK AND MONTH ENUM
//        DayOfWeekAndMonthEnums.dayOfWeek();
//        DayOfWeekAndMonthEnums.month();

        //DATE
//        DateClass.localDateClass();
//        DateClass.yearMonthClass();
//        DateClass.monthDayClass();
//        DateClass.yearClass();

        //LOCAL TIME AND LOCAL DATETIME
//        LocalDateAndTImeClass.example();

        //TIMEZONE  AND OFFSET
//        TimezoneAndOffset.zoneIdAndOffset();
//        TimezoneAndOffset.zonedDateTime();
//        TimezoneAndOffset.offSetDateTime();
//        TimezoneAndOffset.offsetTime();

        //INSTANT
//        InstantClass.example();

        //PARSING AND FORMATTING
//        ParsingAndFormatting.example();

        //TEMPORAL
//        TemporalPackage.temporal();
//        TemporalPackage.temporalFieldsAndUnits();
//        TemporalPackage.temporalAdjusters();

        //Period Duration
//        PeriodDuration.durationTimeBased();
//        PeriodDuration.durationDateBased();
//        PeriodDuration.chronoUnitBetween();

        /* CLOCK */
//        ClockClass.getCurrentTime();
//        ClockClass.getSystemUtc();
//        ClockClass.setClockAsFixed();
//        ClockClass.offSet();

        //Legacy Date-Time Code
        LegacyDateTimeCode.dateToInstantExample();
        LegacyDateTimeCode.formattingDates();

    }
}

class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}

class AnotherMessage {
    static String generateAnotherMessage() {
        return "Here is another message";
    }
}

class Example {
    static void staticMethod() {
        System.out.println("I'm a static method.");
    }

    void nonStaticMethod() {
        System.out.println("I'm a non-static method.");
    }
}

