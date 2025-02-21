package app.class_example;

public class LocalClassExample {
    public void outerMethod() {
        class LocalClass {  // Local class inside method
            void display() {
                System.out.println("Hello from Local Class");
            }
        }
        LocalClass obj = new LocalClass();
        obj.display();
    }
}
