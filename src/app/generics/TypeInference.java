package app.generics;

public class TypeInference {
    public static class Util {
        public static <T> T getValue(T value) {
            return value;
        }
    }
}
