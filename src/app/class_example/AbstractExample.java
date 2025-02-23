package app.class_example;

public class AbstractExample extends  AbstractMethodAndClasses {
    public AbstractExample(String name) {
        this.name = name;
    }

    // Implementing abstract method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof woof!");
    }
}
