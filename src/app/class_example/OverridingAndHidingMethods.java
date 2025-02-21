package app.class_example;

public class OverridingAndHidingMethods {
    public static class Animal {
        public static void testClassMethod() {
            System.out.println("The static method in Animal");
        }
        public void testInstanceMethod() {
            System.out.println("The instance method in Animal");
        }
    }

    public static class Cat extends Animal {
        public static void testClassMethod() {
            System.out.println("The static method in Cat");
        }

        @Override
        public void testInstanceMethod() {
            System.out.println("The instance method in Cat");
        }
    }



}
