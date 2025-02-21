package app.class_example;

public class ArbitraryArguments {
    public static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static class Polygon {
        public static void polygonFromArray(Point[] corners) {
            System.out.print("Array method called with: ");
            for (Point p : corners) {
                System.out.print(p + " ");
            }
            System.out.println();
        }

        public static void polygonFromVarargs(Point... corners) {
            System.out.print("Varargs method called with: ");
            for (Point p : corners) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
