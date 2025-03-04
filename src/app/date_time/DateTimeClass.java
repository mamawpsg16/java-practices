package app.date_time;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.chrono.ThaiBuddhistDate;

public class DateTimeClass {
    public static void localDateExample(){
        System.out.println("---LOCAL DATE---");
        // Get today's date using the ISO-8601 calendar system.
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // Example of a fluent API: find the last day of the current month,
        // then subtract 2 days to simulate a "payday".
        LocalDate payday = today.with(TemporalAdjusters.lastDayOfMonth()).minusDays(2);
        System.out.println("Payday (2 days before month end): " + payday);

        // Create an immutable date using the 'of' static factory method.
        LocalDate dateOfBirth = LocalDate.of(2012, Month.MAY, 14);
        // Adding one year returns a new object (immutability in action).
        LocalDate firstBirthday = dateOfBirth.plusYears(1);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("First Birthday: " + firstBirthday);
    }

    public static void localDateTimeExample() {
        System.out.println("---LOCAL DATE TIME---");
        // Obtain the current date and time.
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Format the date-time using a custom formatter.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }

    public static void zonedAndOffsetDateTimeExample() {
        System.out.println("---ZONED AND OFFSET DATETIME---");
        // ZonedDateTime includes full time zone rules.
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current Date and Time in New York: " + zonedDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
        String formattedDateTime = zonedDateTime.format(formatter);
        System.out.println("NEW YORK Formatted DateTime: " + formattedDateTime);

        // OffsetDateTime represents a date-time with an offset from UTC.
        OffsetDateTime offsetDateTime = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println("Current UTC OffsetDateTime: " + offsetDateTime);
    }

    public static void nonIsoCalendarExample() {
        // ThaiBuddhistDate is an example from the java.time.chrono package,
        // which supports alternative calendar systems.
        ThaiBuddhistDate thaiDate = ThaiBuddhistDate.now();
        System.out.println("Current Thai Buddhist Date: " + thaiDate);
    }
}
