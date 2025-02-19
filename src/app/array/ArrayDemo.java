package app.array;


import java.util.List;

public class ArrayDemo {

    public void printList(){
        var listv2 = List.of("one", "two", "three", "four");
        for (var element : listv2) {
            System.out.println(element);
        }

        var number = Integer.valueOf(10);  // Explicitly use Integer
        var text = "Hello";
        var list = new java.util.ArrayList<>();

        System.out.println("Type of number: " + number.getClass().getSimpleName());
        System.out.println("Type of text: " + text.getClass().getSimpleName());
        System.out.println("Type of list: " + list.getClass().getSimpleName());
    }

    public void copyArray() {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

//        String[] copyTo = new String[7];
//        System.arraycopy(copyFrom, 0, copyTo, 0, 7);
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);
        System.out.print('\n');
        System.out.println("TO STRING " + java.util.Arrays.toString(copyTo) + " TO STRING");
        System.out.print('\n');
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.print('\n');
    }

    public void arrayInitialization() {
        // declares an array of integers
        int[] anArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };
//        int[] anArray;
//
//        // allocates memory for 10 integers
//        anArray = new int[10];
//
//        // initialize first element
//        anArray[0] = 100;
//        // initialize second element
//        anArray[1] = 200;
//        // and so forth
//        anArray[2] = 300;
//        anArray[3] = 400;
//        anArray[4] = 500;
//        anArray[5] = 600;
//        anArray[6] = 700;
//        anArray[7] = 800;
//        anArray[8] = 900;
//        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);
        System.out.println("Element at index 9: "
                + anArray[9]);

        System.out.println("Element Array Length " + anArray.length);
    }
}
