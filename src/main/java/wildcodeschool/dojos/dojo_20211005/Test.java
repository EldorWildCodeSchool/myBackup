package wildcodeschool.dojos.dojo_20211005;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

//https://www.delftstack.com/de/howto/java/java-date-get-year/
public class Test {

    public static void main(String[] args) throws ParseException {

        Date geburtstag = new SimpleDateFormat("dd.MM.yyyy").parse("05.10.1971");
        int birthyear = getYear(geburtstag);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println(year);
        System.out.println("Das Alter des Kunden lautet: " + (year - birthyear));

        getDates();

    }

    public static int getYear(Date date){
        ZoneId timeZone = ZoneId.systemDefault();
        LocalDate getLocalDate = date.toInstant().atZone(timeZone).toLocalDate();
        System.out.println(getLocalDate.getYear());
        System.out.println(getLocalDate);
        return getLocalDate.getYear();
    }

    public static void getDates(){
        LocalDate currentDate = LocalDate.now();  // 1
        DateTimeFormatter frDateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.GERMANY);  // 4
        String frFormattedDate = currentDate.format(frDateFormatter);  // 5
        System.out.println("Current date in GE date format: " + frFormattedDate);
    }


}
