package app.class_example;

public class ObjectDemo {
    public static String text = "Outer Class Text";
    public static String staticOuterField = "Static Outer Field";

    public String publicOuterField = "Public Outer Field";
    public static class ObjectPoint {
        public int x;
        public String text = "Instance Text";
        public int y;
        // a constructor!
        public ObjectPoint(int a, int b) {
            x = a;
            y = b;
        }

        public void display(String text){
            System.out.println("Parameter Text: " + text);
            System.out.println("Instance Text: " + this.text);
            System.out.println("Outer Class Instance Text: " + ObjectDemo.text);
            System.out.println("Accessing: " + staticOuterField);
//            System.out.println("Accessing Instance Field: " + publicOuterField); //ERROR
        }
    }

    public static class ObjectRectangle {
        public int width = 0;
        public int height = 0;
        public ObjectPoint origin;

        // four constructors
        public ObjectRectangle() {
            origin = new ObjectPoint(0, 0);
        }
        public ObjectRectangle(ObjectPoint p) {
            origin = p;
        }
        public ObjectRectangle(int w, int h) {
            origin = new ObjectPoint(0, 0);
            width = w;
            height = h;
        }
        public ObjectRectangle(ObjectPoint p, int w, int h) {
            origin = p;
            width = w;
            height = h;
        }

        // a method for moving the ObjectRectangle
        public void move(int x, int y) {
            origin.x = x;
            origin.y = y;
        }

        // a method for computing the area of the ObjectRectangle
        public int getArea() {
            return width * height;
        }
    }

}
