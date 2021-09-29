package others.aufgabe_01.a_kundenbestand_einlesen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main0 {

    public static void main(String[] args) throws IOException {

        String pathToCsv = "/Users/eldorrabe/Documents/SEA/repositories/sea-resources/Java Übungen/customer_testdata.csv";
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
        List<String[]> customersList = new ArrayList<String[]>();
        String thisLine;
        while ((thisLine = csvReader.readLine()) != null) {
            customersList.add(thisLine.split(";"));
            System.out.println(Arrays.stream(thisLine.split(";")).count());
        }
        String[][] customerArr = new String[customersList.size()][0];
        customersList.toArray(customerArr);

        Kunde[] kundenliste = new Kunde[customerArr.length];
        for(int i = 0; i < customerArr.length; i++) {
            kundenliste[i] = new Kunde(customerArr[i][0], customerArr[i][1], customerArr[i][2], customerArr[i][3], customerArr[i][4],
                    customerArr[i][5], customerArr[i][6], customerArr[i][7], customerArr[i][8]);
        }

        for(int cCount = 0; cCount < kundenliste.length; cCount++){
            String result;
            result = kundenliste[cCount].getCustFirstName()  + ", ";
            result += kundenliste[cCount].getCustLastName() + ", ";
            result += kundenliste[cCount].getCustStreet() + ", ";
            result += kundenliste[cCount].getCustStreetNumber() + ", ";
            result += kundenliste[cCount].getCustPostalCode() + ", ";
            result += kundenliste[cCount].getCustLocation() + ", ";
            result += kundenliste[cCount].getCustPhone() + ", ";
            result += kundenliste[cCount].getCustMobile() + ", ";
            result += kundenliste[cCount].getCustEmail();
            System.out.println(cCount + ". Data: " + result);
        }
    }
}

