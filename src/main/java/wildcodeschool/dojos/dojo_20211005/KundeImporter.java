package wildcodeschool.dojos.dojo_20211005;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.*;

public class KundeImporter {

    public static void main(String[] args){
        Path in = Paths.get("src/test/ressources/kunden_reporting.csv");
        try {
            List<String> importListKunde = Files.readAllLines(in);

            List<Kunde> myCustomerList = new ArrayList<>();
            for(String meinKunde : importListKunde){
                String[] tempArr = meinKunde.split(",");
             String id = tempArr[0];
             String name = tempArr[1];
             String email = tempArr[2];
             Date geburtstag = new SimpleDateFormat("dd.mm.yyyy").parse(tempArr[3]);
             Date letzterKauf = new SimpleDateFormat("dd.mm.yyyy").parse(tempArr[4]);
             String kundeTyp = tempArr[5];
             LocalDate currentDate = LocalDate.parse(tempArr[3]);
             int year = Calendar.getInstance().get(Calendar.YEAR);
             int Age = letzterKauf.getYear();


             if (kundeTyp.equals("E")){
                 myCustomerList.add(new ExklusivKunde(id, name, email,geburtstag,letzterKauf));
             }
             if (kundeTyp.equals("S")){
                 myCustomerList.add(new ExklusivKunde(id, name, email,geburtstag,letzterKauf));
             }

            }


        } catch (IOException | ParseException e){

        }


    }
    public static int getYear(Date date){
        //Date date = new Date();
        ZoneId timeZone = ZoneId.systemDefault();
        LocalDate getLocalDate = date.toInstant().atZone(timeZone).toLocalDate();
        //System.out.println(getLocalDate.getYear());
        return getLocalDate.getYear();
    }
}
