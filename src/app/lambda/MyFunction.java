package app.lambda;

public interface MyFunction {
    void sayHello(); // Only one abstract method

//    void methodTwo();  // ❌ More than one abstract method
    default void anotherMethod() {
        System.out.println("This is a default method.");
    }

    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}