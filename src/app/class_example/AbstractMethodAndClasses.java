package app.class_example;

public abstract  class AbstractMethodAndClasses {
    String name;

    // Abstract method (no body, must be implemented in child classes)
    abstract void makeSound();

    // Concrete method (has implementation)
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
