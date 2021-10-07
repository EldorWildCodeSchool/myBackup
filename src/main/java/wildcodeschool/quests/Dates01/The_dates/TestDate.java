package wildcodeschool.quests.Dates01.The_dates;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class TestDate {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please fill a day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Please fill a month (1-12) :");
        int month = sc.nextInt();
        System.out.println("Please fill a year :");
        int year = sc.nextInt();
        sc.close();

        // TODO : your code after this line

        //Define a 'formatter' to format the string (parts of the date) to a valid Date type
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy", Locale.GERMANY);
        String dateInString = (month + "-" + day + "-" + year);
        Date date = formatter.parse(dateInString);

        // Print the imported Date with a specific format
        // The 'formatter' is used a second time
        System.out.println("\nThe date is: " + formatter.format(date) + " (month-day-year)");

        // Define a second format to get the day as the name of the weekday
        SimpleDateFormat formatter2 = new SimpleDateFormat("EEEE");

        // Print the value of the weekday and also print the name of the weekday (formatted with 'formatter2')
        System.out.println("The day of week is: " + date.getDay() + " (" + formatter2.format(date) + ")");
    }
}