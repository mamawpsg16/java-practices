package app.class_example;

public interface Bicycle {
    // Methods in an interface are implicitly public and abstract
    void changeGear(int newGear);
    void speedUp(int increment);
    void applyBrakes(int decrement);

    static int addSpeed(int speed1, int speed2) {
        return speed1 + speed2;
    }

    // Default method
    default void honk() {
        System.out.println("Honk! Honk!");
    }
}
