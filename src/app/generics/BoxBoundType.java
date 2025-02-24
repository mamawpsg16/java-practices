package app.generics;

public class BoxBoundType<T extends Number> { // T must be a subclass of Number
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}