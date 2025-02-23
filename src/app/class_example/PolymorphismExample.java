package app.class_example;

public class PolymorphismExample {

    public static class Superclass {

        public void printMethod() {
            System.out.println("Printed in Superclass.");
        }
    }

    public static class Subclass extends Superclass {

        // overrides printMethod in Superclass
        public void printMethod() {
            super.printMethod();
            System.out.println("Printed in Subclass");
        }
        public static void main(String[] args) {
            Subclass s = new Subclass();
            s.printMethod();
        }
    }

}
