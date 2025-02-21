package app.class_example;

public class PassedVariableByValueOrReference {
    public static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        public void getName(){
            System.out.println(this.name);
        }
    }

    public static class Test {
        public static void changeName(Person p) {
            p.name = "John"; // Modifies the original object
        }
    }
}