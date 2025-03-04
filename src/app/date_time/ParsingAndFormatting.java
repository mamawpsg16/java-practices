package app.date_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.Date;

public class ParsingAndFormatting {
    public static void example(){
    // --- Date Parsing and Formatting ---

        // Example date string in "yyyy-MM-dd" format
        String dateString = "2025-02-27";
        // Create a SimpleDateFormat object to parse the date string
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Parse the string into a Date object
            Date date = parser.parse(dateString);
            // Print the parsed Date object (default format)
            System.out.println("Parsed date: " + date);

            // Create another SimpleDateFormat object for formatting the Date
            // This format will output the date as "dd-MMM-yyyy" (e.g., "27-Feb-2025")
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            // Format the Date object into the desired string representation
            String formattedDate = formatter.format(date);
            // Print the formatted date string
            System.out.println("Formatted date: " + formattedDate);
        } catch (ParseException e) {
            // Handle exception if the date string is not in the expected format
            System.out.println("Error parsing date: " + e.getMessage());
        }

        // --- Number Parsing and Formatting ---

        // Example number in string format
        String numberString = "12345.6789";
        // Parse the string into a double value
        double number = Double.parseDouble(numberString);
        // Print the parsed number
        System.out.println("Parsed number: " + number);

        // Create a DecimalFormat object to format the number
        // The format "#,###.00" means:
        // - Use commas as thousand separators
        // - Always show two decimal places
        DecimalFormat numberFormatter = new DecimalFormat("#,###.00");
        // Format the double value using the defined format
        String formattedNumber = numberFormatter.format(number);
        // Print the formatted number string
        System.out.println("Formatted number: " + formattedNumber);
    }
}
