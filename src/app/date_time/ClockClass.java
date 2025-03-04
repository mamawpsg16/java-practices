package app.date_time;

import java.time.*;

public class ClockClass {
    public static void getCurrentTime() {
        Clock clock = Clock.systemDefaultZone(); // Uses the system default time zone
        Instant instant = clock.instant(); // Gets the current instant
        System.out.println("Current Instant: " + instant);
    }

    public static void getSystemUtc(){
        Clock clockUTC = Clock.systemUTC();
        Instant instantUTC = clockUTC.instant();
        System.out.println("UTC Time: " + instantUTC);
    }

    public static void setClockAsFixed(){
        Clock fixedClock = Clock.fixed(Instant.parse("2024-02-27T10:15:30.00Z"), ZoneId.of("UTC"));
        System.out.println("Fixed Instant: " + fixedClock.instant());
    }

    public static void offSet(){
        Clock baseClock = Clock.systemUTC();
        Clock offsetClock = Clock.offset(baseClock, Duration.ofHours(5)); // Add 5 hours
        System.out.println("Offset Clock Time: " + offsetClock.instant());
    }
}
