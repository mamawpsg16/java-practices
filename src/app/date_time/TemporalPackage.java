package app.date_time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.ChronoField;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalPackage {
    public static void temporal(){
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime tomorrow = dateTime.plus(1, ChronoUnit.DAYS);
        DateTimeFormatter formatSequence = DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm:ss");
        System.out.println("Tommorow = " + tomorrow.format(formatSequence));
    }

    public static void temporalFieldsAndUnits(){
        LocalDate today = LocalDate.now();
        // LocalDate does not support clock hour (like a 12-hour clock), so this returns false.
        boolean supportsClockHour = today.isSupported(ChronoField.CLOCK_HOUR_OF_DAY);
        System.out.println("supportsClockHour = " + supportsClockHour);
    }

    public static void temporalAdjusters(){
        LocalDate date = LocalDate.of(2000, Month.OCTOBER, 15);
        System.out.printf("first day of Month: %s%n", date.with(TemporalAdjusters.firstDayOfMonth()));
        System.out.printf("first Monday of Month: %s%n", date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));

        // ======================================
        // Example 2: Predefined TemporalAdjusters with LocalDate
        // ======================================
        LocalDate dateV1 = LocalDate.of(2000, Month.OCTOBER, 15);
        DayOfWeek dayOfWeek = dateV1.getDayOfWeek();
        System.out.printf("%s is on a %s%n", dateV1, dayOfWeek);

    }
}
