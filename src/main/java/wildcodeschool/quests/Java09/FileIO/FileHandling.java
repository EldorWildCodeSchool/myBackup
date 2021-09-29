package wildcodeschool.quests.Java09.FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;


public class FileHandling {

    public static void main(String[] args) throws IOException {

        // 1. Read file from new File("src/test/resources/kunden.csv").
        // Use NIO for file reading, the NIO static utility method Files.readAllLines
        // returns a List<String> of all lines in the file, each line one entry of the list
        Path importCSV = Paths.get("src/test/resources/kunden.csv");
        List<String> customerImportList = Files.readAllLines(importCSV);

        // 2. Split each line into a String array, use the correct separator string ",".
        // Each line consists of "id,name,email" of a Kunde.
        // 3. Convert each line into an object of class Kunde, which already has a suitable constructor (id,name,email)
        // 4. Add all Kunde objects to a new List<Kunde>
        List<Kunde> customerList = new ArrayList<>();
        for (String currCustomerString : customerImportList){
            // Instantiate and fill a temporary data array "customerDataArr" of type String on each iteration with the attributes of one customer
            String[] customerDataArr = currCustomerString.split(",");
            // create a new object of type "Kunde" and add the object reference to the array list "kunde"
            customerList.add(new Kunde(customerDataArr[0], customerDataArr[1], customerDataArr[2]));
        }
        /*ER: Example how to create and add Kunden-objects directly into the array list without generating a "temporary" data array
        List<Kunde> customerList = new ArrayList<>();
        for (String newCustomer : customerImportList){
            customerList.add(new Kunde(newCustomer.split(",")[0],newCustomer.split(",")[1], newCustomer.split(",")[2]));
        }
        */

        // Creates a datafile with a sorted customer list
        writeSortedKundenIO(sortKunden(customerList));
        writeSortedKundenNIO(sortKunden(customerList));

        // 8. Push all your changes to your fork of the repo
    }


    // 5. In this FileHandling class, create a static method searchForId which takes the List<Kunde> and a String searchId, searches for the Kunde with this searchId as ID and returns the name
    public static String searchForId(List<Kunde> kunden, String id) {
        // Iterate through the list, search for the id and return the name if found.
        for(Kunde searchById : kunden ){
            if(searchById.getId().equals(id)){
                return searchById.getName();
            }
        }
        return "Customer not found with id " + id;
    }


    // 6. (Opt.) In this class, create a static method sortKunden which takes the List<Kunde>, sorts this list for the names and returns the sorted List<Kunde>
    public static List<Kunde> sortKunden(List<Kunde> kunden) {

       // Sort the transferred array list "kunden" with sort as a method of List-object
       kunden.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
       return kunden;
    }


    // 7. (Opt.) Write the sorted list to a new File("src/test/resources/sorted_kunden.csv"), you can use the writeSortedKunden method.
    // To see the file in the IDE you might have to "reload all files from disk".
    // Write each line to the file. If it looks funny, maybe you have to add a line separator (System.lineSeparator())
    public static void writeSortedKundenIO(List<Kunde> lines) throws IOException {
        File out = new File("src/test/resources/sorted_kunden.csv");
        BufferedWriter writer = new BufferedWriter(new FileWriter(out));
        for(Kunde currCustomer: lines) {
            //writer.write(currCustomer.getId() + "," + currCustomer.getName() + "," + currCustomer.getEmail() + System.lineSeparator());
            writer.write(currCustomer.serializedCSV());
        }
        writer.close();
    }

    public static void writeSortedKundenNIO(List<Kunde> lines) throws IOException {
        Path out = Paths.get("src/test/resources/sorted_kunden_2.csv");
        BufferedWriter writer = Files.newBufferedWriter(out, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
        for(Kunde currCustomer : lines){
            //writer.append(currCustomer.getId() + "," + currCustomer.getName() + "," + currCustomer.getEmail() + System.lineSeparator());
            writer.append(currCustomer.serializedCSV());
        }
        writer.close();
    }
}
