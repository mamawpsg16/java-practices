package app;

import app.class_example.OverridingAndHidingMethods;
import app.class_example.PersonRecordImmutable;
import app.class_example.ProductRecordImmutable;
import app.class_example.NumberAndStrings;
import app.class_example.Pegasus;
import app.class_example.PolymorphismExample.Subclass;
import app.class_example.AbstractExample;

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
//
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

        Subclass subClass = new Subclass();
        subClass.printMethod();

        AbstractExample abstractExample = new AbstractExample("Dawg");
        abstractExample.makeSound();
        abstractExample.sleep();
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

