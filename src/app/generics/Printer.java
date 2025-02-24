package app.generics;

public class Printer<T> implements Printable<T> {
    public void print(T item) {
        System.out.println("Printing: " + item);
    }
}