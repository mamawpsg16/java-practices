package app.class_example;

public class MountainBike extends Bike {
    private int seatHeight; // Extra feature specific to MountainBike
    private String model;

    public MountainBike(String type, String model, int seatHeight) {
        super(type);
        this.seatHeight = seatHeight;
        this.model = model;
    }

    public void setSeatHeight(int newHeight) {
        this.seatHeight = newHeight;
    }

    public void getCadence(){
        System.out.println("Cadence = " + this.cadence);
    }
    @Override
    public void printStates() {
        super.printStates();
        System.out.println("Seat Height: " + seatHeight + ", Type: " + type + ", Model: " + model );
    }

    public void printNormalBikeState() {
        System.out.println("Mountain Bike Calling Super Class PrintState method" );
        super.printStates(); // Calls the parent class method
    }
}
