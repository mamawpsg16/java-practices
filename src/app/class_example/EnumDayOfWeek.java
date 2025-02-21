package app.class_example;

public enum EnumDayOfWeek {
    /* FIRST METHOD */
//    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

    /* SECOND METHOD */
    MONDAY("MON"), TUESDAY("TUE"), WEDNESDAY("WED"), THURSDAY("THU"), FRIDAY("FRI"), SATURDAY("SAT"), SUNDAY("SUN");

    private final String abbreviation;

    EnumDayOfWeek(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static void compareDayOfWeek(EnumDayOfWeek dayOfWeek){
        int comparison = dayOfWeek.compareTo(EnumDayOfWeek.WEDNESDAY);
        if (comparison < 0) {
            System.out.println("It's before the middle of the work week.");
        } else if (comparison > 0){
            System.out.println("It's after the middle of the work week.");
        } else {
            System.out.println("It's the middle of the work week.");
        }
    }

}
