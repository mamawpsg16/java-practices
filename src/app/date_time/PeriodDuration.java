package app.date_time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDuration {
    //Measures time in seconds and nanoseconds.
    public static void durationTimeBased(){
        Instant t1 = Instant.now();
        Instant t2 = t1.plusSeconds(30);
        long ns = Duration.between(t1, t2).toNanos();
        System.out.println("Duration in nanoseconds: " + ns);

        Duration gap = Duration.ofSeconds(10);
        Instant later = t1.plus(gap);
        System.out.println("New instant: " + later);
    }

    //Measures time in years, months, and days.
    public static void durationDateBased(){
        LocalDate birthDate = LocalDate.of(2000, 1, 1);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days.");
    }

    //Provides a single-unit measurement (e.g., days, hours).
    public static void chronoUnitBetween(){
        Instant t1 = Instant.now();
        Instant t2 = t1.plusSeconds(30);
        LocalDate today = LocalDate.now();
        long millis = ChronoUnit.MILLIS.between(t1, t2);
        System.out.println("Time difference in milliseconds: " + millis);

        LocalDate birthday = LocalDate.of(2000, 1, 1);
        long daysOld = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("Total days since birth: " + daysOld);

    }
}
