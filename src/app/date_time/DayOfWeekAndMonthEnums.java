package app.date_time;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeekAndMonthEnums {
    public static void dayOfWeek(){
        System.out.printf("%s%n", DayOfWeek.MONDAY.plus(3));

        DayOfWeek dow = DayOfWeek.MONDAY;
        Locale locale = Locale.getDefault();
        System.out.println("locale = " + locale);
        System.out.println(dow.getDisplayName(TextStyle.FULL, locale));
        System.out.println(dow.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(dow.getDisplayName(TextStyle.SHORT, locale));
    }

    public static void month(){
        System.out.printf("%d%n", Month.FEBRUARY.maxLength());
        Month month = Month.AUGUST;
        Locale locale = Locale.getDefault();
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(month.getDisplayName(TextStyle.SHORT, locale));
    }
}
