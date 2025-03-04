package app.date_time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class InstantClass {
    public static final DateTimeFormatter ZDT_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");

    public static void example(){
        // Getting the Current Timestamp
        Instant timestamp = Instant.now();
        System.out.println("Current timestamp: " + timestamp);

        // Convert Instant to ZonedDateTime before formatting
        ZonedDateTime zonedDateTime = timestamp.atZone(ZoneId.systemDefault());
        System.out.println("Formatted timestamp: " + ZDT_FORMATTER.format(zonedDateTime));

        // Arithmetic Operations
        Instant oneHourLater = timestamp.plus(1, ChronoUnit.HOURS);
        ZonedDateTime formattedOneHourLater = oneHourLater.atZone(ZoneId.systemDefault());
        System.out.println("One hour later (formatted): " + ZDT_FORMATTER.format(formattedOneHourLater));

        //Comparing Instants:
        Instant now = Instant.now();
        Instant earlier = now.minus(10, ChronoUnit.SECONDS);
        if (now.isAfter(earlier)) {
            System.out.println("Now is after 10 seconds ago.");
        }

        //Calculating Time Differences:
        long secondsFromEpoch = Instant.ofEpochSecond(0L).until(Instant.now(), ChronoUnit.SECONDS);
        System.out.println("Seconds since epoch: " + secondsFromEpoch);

        //Conversion to Human-Readable Date-Time
        Instant timestampV1 = Instant.now();
        LocalDateTime ldt = LocalDateTime.ofInstant(timestampV1, ZoneId.systemDefault());
        System.out.printf("Formatted date and time: %s %d %d at %d:%d%n", ldt.getMonth(), ldt.getDayOfMonth(), ldt.getYear(), ldt.getHour(), ldt.getMinute());
    }
}
