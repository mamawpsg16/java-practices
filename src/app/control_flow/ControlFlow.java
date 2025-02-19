package app.control_flow;
import test.Test;

public class ControlFlow {
    public ControlFlow() {  // Constructor must not have a return type
        Test test = new Test();
        test.test();

        System.out.println("Constructor End" +"\n");
    }

    public void ifStatement(){
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
        System.out.println("If Statement End" +"\n");
    }

    public void whileStatement(){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        System.out.println("While Statement End" +"\n");
    }

    public void doWhileStatement(){
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);

        System.out.println("Do While Statement End" +"\n");
    }

    public void forStatement(){
        for(int i = 1; i < 11; i++){
            System.out.println("Count is: " + i);
        }
        System.out.println("First For Statement End" +"\n");
        int[] numbers =
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }

        System.out.println("Second For Statement End" +"\n");
    }

    public void switchStatement(){
        String month = "January"; // any month
        int monthNumber = -1;

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }
        System.out.println("Month Number = " + monthNumber) ;
        System.out.println("Switch Statement End" +"\n");
    }
    /* Exits only the innermost loop when encountered. */
    public void unlabeledBreakStatement(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    break;  // Exits only the inner loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Unlabeled Break Statement End" +"\n");
    }

    /* Exits the specified labeled loop, not just the innermost one. */
    public void labeledBreakStatement(){
        int[][] arrayOfInts = {
                {  32,   87,    3, 589 },
                {  12, 1076, 2000,   8 },
                { 622,  127,   77, 955 }
        };
        int searchfor = 12;

        int i;
        int j = 0;
        boolean foundIt = false;

        search:
        for (i = 0; i < arrayOfInts.length; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) {
                if (arrayOfInts[i][j] == searchfor) {
                    foundIt = true;
                    break search;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }
        System.out.println("Labeled Break Statement End" +"\n");
    }


    /* Exits only the innermost loop when encountered. */
    public void unlabeledContinueStatement(){
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
        System.out.println("unlabeledContinue Statement End" +"\n");
    }

    /* Exits the specified labeled loop, not just the innermost one. */
    public void labeledContinueStatement(){
        outerLoop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    continue outerLoop;  // Skips to next iteration of outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("labeledContinue Statement End" +"\n");
    }

    public void yieldStatement(){
        String day = "MONDAY";

        String type = switch (day) {
            case "SATURDAY", "SUNDAY" -> "Weekend";
            case "MONDAY" -> "Start of the week";
            default -> "Weekday";
        };

        System.out.println(type); // Output: Start of the week
        System.out.println("Yield Statement End" +"\n");
    }

    public int yieldStatementCalculate(Day d) {
        int remainingWorkDays = switch (d) {
            case SATURDAY, SUNDAY -> 0;
            default -> {
                int remaining = 5 - d.ordinal();
                System.out.println(remaining + "\n");
                yield remaining;
            }
        };
        System.out.println("Yield Statement Calculate End" + "\n");
        return remainingWorkDays;
    }
}
