package app.class_example;

public class AcmeBicycle implements Bicycle {
    private int speed;
    private int gear;

    // Implementing methods from the Bicycle interface
    @Override
    public void changeGear(int newGear) {
        this.gear = newGear;
        System.out.println("Gear changed to: " + gear);
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
        System.out.println("Speed increased to: " + speed);
    }

    @Override
    public void applyBrakes(int decrement) {
        this.speed -= decrement;
        System.out.println("Speed decreased to: " + speed);
    }

    // Method to display current state
    public void displayState() {
        System.out.println("Current speed: " + speed + ", Current gear: " + gear);
    }

}
