package app.date_time;

import java.time.*;

public class StandardCalendar {
    public static void example() {
        // Machine time: 'Instant' represents a point on the timeline in nanosecond precision.
        Instant currentInstant = Instant.now();
        System.out.println("Current timestamp (machine time): " + currentInstant);

        // Human time: 'LocalDate' represents a date without time (e.g., a birth date).
        LocalDate birthDate = LocalDate.of(1990, Month.JANUARY, 1);
        System.out.println("Birth date (human time): " + birthDate);

        // Human time with both date and time: 'LocalDateTime' represents a date and time, without a time zone.
        LocalDateTime meetingDateTime = LocalDateTime.of(2025, Month.MARCH, 10, 14, 30);
        System.out.println("Meeting date and time (local, human time): " + meetingDateTime);

        // Human time with time zone: 'ZonedDateTime' represents a date and time including a time zone.
        ZonedDateTime meetingInTokyo = ZonedDateTime.of(meetingDateTime, ZoneId.of("Asia/Tokyo"));
        System.out.println("Meeting time in Tokyo (human time with zone): " + meetingInTokyo);

        // Duration: Measures time in seconds and nanoseconds.
        // Use Duration when you want to represent an amount of time, e.g., 20 hours.
        Duration duration20Hours = Duration.ofHours(20);
        System.out.println("Duration of 20 hours: " + duration20Hours);

        // Period: Represents a date-based amount of time (years, months, days).
        // Use Period when you need to represent a number of days, months, or years.
        Period period10Days = Period.ofDays(10);
        System.out.println("Period of 10 days: " + period10Days);

        // Example use case: Calculating a new date by adding a period to an existing date.
        LocalDate newBirthDate = birthDate.plus(period10Days);
        System.out.println("Birth date plus 10 days: " + newBirthDate);

        System.out.println("YEAR = "+Year.now());
        YearMonth ym = YearMonth.of(2024, 12);
        System.out.println("YearMonth for December 2024: " + ym);

        // Example use case: determining the billing date for a subscription.
        // Assume billing occurs on the last day of the month.
        int billingDay = ym.lengthOfMonth();
        System.out.println("Billing day for " + ym + " is: " + billingDay);
    }
}
