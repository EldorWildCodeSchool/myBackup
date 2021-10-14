package codecatcher.snippets;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatThisDate {

    public static void main(String[] args) {

        LocalDate myFirstDate = LocalDate.parse("2010-01-01");
        LocalDate mySecondDate = LocalDate.parse("2020-01-01");
        getDates(myFirstDate, mySecondDate);

    }

    public static void getDates(LocalDate fDate, LocalDate sDate) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("The first date value is: \t" + fDate);
        System.out.println("The second date value is: \t" + sDate);
        System.out.println("The current date value is: \t" + sDate);

        System.out.println("\nNow formatting first and second date with localized attributes:");


        DateTimeFormatter geDateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMANY);  // 4
        String geFormattedDate = fDate.format(geDateFormatter);  // 5
        System.out.println("First date in GE (GERMAN) date format (MEDIUM): \t" + geFormattedDate + "\t 'Das Jahr, in dem wir Kontakt aufnahmen' ;-)");


        DateTimeFormatter chDateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.CHINA);  // 4
        String chFormattedDate = sDate.format(chDateFormatter);  // 5
        System.out.println("Second date in CH (CHINA) date format (LONG): \t\t" + chFormattedDate);

        System.out.println("\nYears between first and second date in years: \t\t" + Period.between(fDate, sDate).getYears());
    }
}
