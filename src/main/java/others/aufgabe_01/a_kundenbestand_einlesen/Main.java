package others.aufgabe_01.a_kundenbestand_einlesen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        // read a separated list of customer data from a csv-file into a character buffer
        //DOCS ORA @ BufferedReader:  https://docs.oracle.com/javase/8/docs/api/java/io/BufferedReader.html
        String pathToCsv = "/Users/eldorrabe/Documents/SEA/repositories/sea-resources/Java Übungen/customer_testdata.csv";
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));

        // load each line of the buffered customer data as one entry of an instantiated ArrayList "customerList"
        // DOCS ORA @ ArrayList: https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#ArrayList--
        List<String> customersList = new ArrayList<>();
        String thisLine;
        while ((thisLine = csvReader.readLine()) != null) {
            customersList.add(thisLine);
        }

        /* Instantiate an array "kundenliste" of type "Kunde" with the size of the ArrayList, to store the object references
          of each created object of type "Kunde" */
        Kunde[] kundenliste = new Kunde[customersList.size()];

        /* For each entry of the ArrayList "customerList" the containing separated string will be split in single values.
         The method "split" of object type "String" returns the data as an array, containing the data of one customer
         at a time. Therefore, single fields can be addressed like in an array.
         Objects of Type "Kunde" will be instantiated and the object references of each "Kunde" will be stored
         within the array "kundenliste"
         */
        String currCustomerString;
        for (int cCount = 0; cCount < customersList.size(); cCount++){
            // Load a row of the array into the object of the type String (so that the line can be divided with attributes)
            currCustomerString = customersList.get(cCount);
            // create a new object of type "Kunde" and add the object reference to the array "kundenliste"
            kundenliste[cCount] = new Kunde(currCustomerString.split(";")[0], currCustomerString.split(";")[1], currCustomerString.split(";")[3], currCustomerString.split(";")[4],
                    currCustomerString.split(";")[4], currCustomerString.split(";")[5], currCustomerString.split(";")[6], currCustomerString.split(";")[7], currCustomerString.split(";")[8]);
        }

        // Export the ArrayList with overwriten toString-Method of class/type Kunde
        System.out.println(Arrays.toString(kundenliste));

        // iterate through the array "kundenliste" and print out the attributes of each customer in one line
        // the attributes are read out via the respective getter-methods of the object variables.
        // This should be put as method into the Class Kunde
        // Ghist for the class Kunde: https://gist.github.com/EldorWildCodeSchool/d97ea3b1512f8858a8e7a2678a616046

        /*for(int cPrintCount = 0; cPrintCount < kundenliste.length; cPrintCount++) {
            String result;
            result = kundenliste[cPrintCount].getCustFirstName() + ", ";
            result += kundenliste[cPrintCount].getCustLastName() + ", ";
            result += kundenliste[cPrintCount].getCustStreet() + ", ";
            result += kundenliste[cPrintCount].getCustStreetNumber() + ", ";
            result += kundenliste[cPrintCount].getCustPostalCode() + ", ";
            result += kundenliste[cPrintCount].getCustLocation() + ", ";
            result += kundenliste[cPrintCount].getCustPhone() + ", ";
            result += kundenliste[cPrintCount].getCustMobile() + ", ";
            result += kundenliste[cPrintCount].getCustEmail();
            System.out.println(cPrintCount + ". Data: " + result);
        }
        */
    }
}
