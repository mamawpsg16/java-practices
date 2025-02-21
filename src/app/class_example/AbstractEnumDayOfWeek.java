package app.class_example;

public enum AbstractEnumDayOfWeek {
    MONDAY {
        @Override
        public String getMessage() {
            return "Start of the work week!";
        }
    },
    TUESDAY {
        @Override
        public String getMessage() {
            return "At least it's not Monday.";
        }
    },
    WEDNESDAY {
        @Override
        public String getMessage() {
            return "Midweek blues!";
        }
    },
    THURSDAY {
        @Override
        public String getMessage() {
            return "Almost there!";
        }
    },
    FRIDAY {
        @Override
        public String getMessage() {
            return "Weekend is near!";
        }
    },
    SATURDAY {
        @Override
        public String getMessage() {
            return "Weekend vibes!";
        }
    },
    SUNDAY {
        @Override
        public String getMessage() {
            return "Relax and recharge!";
        }
    };

    // Abstract method (each enum must implement it)
    public abstract String getMessage();
}
