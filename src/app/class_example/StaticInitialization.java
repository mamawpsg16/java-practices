package app.class_example;

import java.util.Map;
import java.util.HashMap;

public class StaticInitialization {
    public static Map<String, String> settings = new HashMap<>();
    public static int value;
//    static {
//        settings.put("app_name", "MyApp");
//        settings.put("version", "1.0");
//        System.out.println("Static block initialized settings.");
//    }

    // Private static method for initialization
    private static void initialize() {
        settings.put("app_name", "MyApp");
        settings.put("version", "1.0");
        System.out.println("Static method executed.");
    }

    // Static block calls the method
    static {
        value = 2;
        initialize();
    }

    // Public method to reinitialize settings
    public static void resetSettings() {
        settings.clear(); // Clear existing data
        value = 5;
        initialize(); // Call the method again
    }

}
