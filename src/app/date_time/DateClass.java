package app.date_time;

import java.time.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateClass{
    public static void localDateClass(){
//        LocalDate date = LocalDate.of(2000, Month.NOVEMBER, 20);
        LocalDate date = LocalDate.now();
        LocalDate nextWed = date.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println("Next Wednesday = " + nextWed);

        DayOfWeek dotw = LocalDate.of(2025, Month.FEBRUARY, 26).getDayOfWeek();
        System.out.println("dotw = " + dotw);

        LocalDate dateV1 = LocalDate.of(2000, Month.NOVEMBER, 20);
        TemporalAdjuster adj = TemporalAdjusters.next(DayOfWeek.WEDNESDAY);
        LocalDate nextWedV1 = dateV1.with(adj);
        System.out.printf("For the date of %s, the next Wednesday is %s.%n",
                dateV1, nextWedV1);
    }

    public static void yearMonthClass(){
        YearMonth date = YearMonth.now();
        System.out.printf("%s: %d%n", date, date.lengthOfMonth());

        YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());

        YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
        System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());
    }

    public static void monthDayClass(){
        MonthDay date = MonthDay.of(Month.FEBRUARY, 29);
        boolean validLeapYear = date.isValidYear(20);
        System.out.println("isValidLeapYear = " + validLeapYear);
    }

    public static void yearClass(){
        boolean validLeapYear = Year.of(2012).isLeap();
        System.out.println("isValidLeapYear = " + validLeapYear);
    }
}
