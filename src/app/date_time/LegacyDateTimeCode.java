package app.date_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LegacyDateTimeCode {
    public static void dateToInstantExample() {
        // Create a Date object (Legacy)
        Date oldDate = new Date();
        System.out.println("Old Date: " + oldDate);

        // Convert Date to Instant
        Instant instant = oldDate.toInstant();
        System.out.println("Converted Instant: " + instant);

        // Convert Instant back to Date
        Date newDate = Date.from(instant);
        System.out.println("New Date from Instant: " + newDate);
    }

    public static void formattingDates(){
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define a custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the date and time
        String formattedDate = now.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);
    }
}
