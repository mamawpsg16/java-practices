package app.date_time;

import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAndTImeClass {
    public static void example() {
        // -------------------------
        // Using LocalTime
        // -------------------------

        // Create a LocalTime instance representing the current time
        LocalTime currentTime = LocalTime.now();
        // Create a formatter with the pattern "HH:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        // Format the current time using the formatter
        String formattedTime = currentTime.format(formatter);
        System.out.println("Current Time: " + formattedTime);

        // Create a LocalTime instance representing a specific time (10:15:30)
        LocalTime specificTime = LocalTime.of(10, 15, 30);
        System.out.println("Specific Time: " + specificTime);

        // Extract and display individual components of the current time
        int hour = currentTime.getHour();   // Gets the hour of the day
        int minute = currentTime.getMinute(); // Gets the minute of the hour
        int second = currentTime.getSecond(); // Gets the second of the minute
        System.out.println("Hour: " + hour + ", Minute: " + minute + ", Second: " + second);

        // -------------------------
        // Using LocalDateTime
        // -------------------------

        // Create a LocalDateTime instance representing the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentDateTime);

        // Create a LocalDateTime instance representing a specific date and time (e.g., March 1, 2025 at 12:30:45)
        LocalDateTime specificDateTime = LocalDateTime.of(2025, 3, 1, 12, 30, 45);
        System.out.println("Specific DateTime: " + specificDateTime);

        // Extract and display the date and time components separately
        System.out.println("Date: " + currentDateTime.toLocalDate()); // Extracts the date part
        System.out.println("Time: " + currentDateTime.toLocalTime()); // Extracts the time part
    }
}
