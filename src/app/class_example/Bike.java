package app.class_example;

public class Bike {
    static int value;

    // Static Initialization Block
    static {
        value = 10;
        System.out.println("Static block executed. Value set to: " + value);
    }
    protected int cadence = 0;
    protected int speed = 0;
    protected int gear = 1;
    protected String type;

    public static int numberOfBicycles = 0;
    public static final double PI = 3.141592653589793;

    public Bike(String type){
        ++this.numberOfBicycles;
        this.type = type;
        System.out.println("Bike Constructor");
    }
    public void changeCadence(int newValue) {
        cadence = newValue;
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void applyBrakes(int decrement) {
        speed -= decrement;
    }

    public void printStates() {
        System.out.println("Cadence: " + cadence + " | Speed: " + speed + " | Gear: " + gear);
    }
}
