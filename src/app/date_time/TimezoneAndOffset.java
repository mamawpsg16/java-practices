package app.date_time;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.OffsetTime;

public class TimezoneAndOffset {
    public static void zoneIdAndOffset() {
        // Get system's default time zone
        ZoneId defaultZone = ZoneId.systemDefault();
        System.out.println("Default Zone: " + defaultZone);

        // Get a specific time zone
        ZoneId zoneNY = ZoneId.of("America/New_York");
        System.out.println("New York Zone: " + zoneNY);

        // Get a specific UTC offset
        ZoneOffset offset = ZoneOffset.of("+05:30");
        System.out.println("Offset: " + offset);
    }

    public static void zonedDateTime(){
        // Get current date-time in a specific zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Current time in Tokyo: " + zonedDateTime);

        ZonedDateTime currentZonedTIme = ZonedDateTime.now(ZoneId.systemDefault());
        System.out.println("Current Zone TIme: " + currentZonedTIme);

        // Convert local date-time to another zone
        ZonedDateTime newYorkTime = zonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Same instant in New York: " + newYorkTime);
    }

    public static void offSetDateTime(){
        // Get current date-time with an offset
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println("OffsetDateTime now: " + offsetDateTime);

        // Create OffsetDateTime with specific offset
        OffsetDateTime customOffsetTime = OffsetDateTime.now(ZoneOffset.of("+02:00"));
        System.out.println("OffsetDateTime with +02:00: " + customOffsetTime);
    }

    public static void offsetTime(){
        // Get the current time with an offset
        OffsetTime offsetTime = OffsetTime.now();
        System.out.println("Current OffsetTime: " + offsetTime);

        // Create a specific OffsetTime
        OffsetTime customTime = OffsetTime.of(14, 30, 0, 0, ZoneOffset.of("+03:00"));
        System.out.println("Custom OffsetTime: " + customTime);
    }
}
