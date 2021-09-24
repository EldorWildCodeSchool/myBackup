package others.aufgabe_01.c_kundenbestand_durchsuchen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        String pathToCsv = "/Users/eldorrabe/Documents/SEA/repositories/sea-resources/Java Übungen/customer_testdata_short.csv";
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));

        List<String> customersList = new ArrayList<>();
        String thisLine;
        while ((thisLine = csvReader.readLine()) != null) {
            customersList.add(thisLine);
        }

        Kunde[] kundenliste = new Kunde[customersList.size()];

        String currCustomerString;
        for (int cCount = 0; cCount < customersList.size(); cCount++) {
            // Load a row of the array into the object of the type String (so that the line can be divided with attributes)
            currCustomerString = customersList.get(cCount);
            // create a new object of type "Kunde" and add the object reference to the array "kundenliste"
            kundenliste[cCount] = new Kunde(currCustomerString.split(";")[0], currCustomerString.split(";")[1], currCustomerString.split(";")[3], currCustomerString.split(";")[4],
                    currCustomerString.split(";")[4], currCustomerString.split(";")[5], currCustomerString.split(";")[6], currCustomerString.split(";")[7], currCustomerString.split(";")[8]);
        }
        // Print the unsorted customer array
        System.out.println("--- UNSORTED ---");
        System.out.println(Arrays.toString(kundenliste));


        // Print the array sorted by last name
        System.out.println("--- SORTED BY LASTNAME ---");
        System.out.println(Arrays.toString(selectionSort2(kundenliste)));

        // Print the array sorted by last name and, in groups of last names, by first name
        System.out.println("--- SORTED BY LASTNAME AND FIRST NAME ---");
        System.out.println(Arrays.toString(selectionSort(kundenliste)));

        // Print the first customer found in the array by lastname
        System.out.println("--- FIRST CUSTOMER IN ARRAY FOUND BY NAME ---");
        System.out.println(searchSequential(kundenliste, "Logan"));

        // Print, if no customer could be found in the array by lastname with the selectionSort search algorithm
        System.out.println("--- NO CUSTOMER IN ARRAY FOUND BY NAME ---");
        System.out.println(searchSequential(kundenliste, "Rabe"));
        System.out.println();

        // Print the first customer found in the array by lastname with the binary search algorithm
        System.out.println("--- FIRST CUSTOMER IN ARRAY FOUND BY NAME WITH BINARY SEARCH ---");
        //Kundenliste vor dem binarySearch sortieren
        Kunde[] kundenlisteSort = selectionSort(kundenliste);
        System.out.println(binarySearch(kundenlisteSort, "Logan"));

        // Print, if no customer could be found in the array by lastname with the binary search algorithm
        System.out.println("--- NO CUSTOMER IN ARRAY FOUND BY NAME WITH BINARY SEARCH ---");
        //Kundenliste vor dem binarySearch sortieren
        System.out.println(binarySearch(kundenlisteSort, "Rabe"));
    }

    public static String binarySearch(Kunde[] kundenliste, String searchValue){
        int leftBorder = 0;
        int rightBorder = kundenliste.length - 1;

        // with every iteration the (remaining part) of the array will be split in two parts
        while (leftBorder <= rightBorder) {
            // Define, what's the middle position of the sorted array
            int middle = leftBorder + (rightBorder - leftBorder) / 2;
            // Check if customer is present at middle position of the sorted array
            if (kundenliste[middle].getCustLastName().equals(searchValue)){
                return kundenliste[middle].toString();
            }
            // If the search value for customer name is greater then the customer name in the middle
            // of the array, ignore left half of the array.
            if (kundenliste[middle].getCustLastName().compareTo(searchValue) < 0){
                leftBorder = middle + 1;
            }
            // If the customer name is smaller then the middle value of the array, ignore right half of the array
            else{
                rightBorder = middle - 1;
            }
        }
        // Return, if at the end of the loop no customer could be found within the array by binary search
        return "No customer with name " + searchValue.toUpperCase() + " found in array!";
    }


    public static String searchSequential(Kunde[] kundenliste, String lastname){

        for (Kunde searchCustomer : kundenliste){
            if (searchCustomer.getCustLastName().equals(lastname)){
                return searchCustomer.toString();
            }
        }
        return "No customer with name " + lastname.toUpperCase() + " found in array!";
    }


    public static Kunde[] selectionSort2(Kunde[] kundenliste) {
        //https://www.happycoders.eu/de/algorithmen/selection-sort/
        //https://www.happycoders.eu/de/java/comparator-comparable-compareto/

        int length = kundenliste.length;
        // Outer loop, to divide the array elements from unsorted to sorted till no unsorted elements are left
        for (int i = 0; i < length - 1; i++) {
            // Inner loop to search the smallest element (by last name of Kunde) in the remaining array
            int minPos = i;
            Kunde min = kundenliste[minPos];
            for (int j = i + 1; j < length; j++) {
                //If the next array value is smaller than the value in the current position
                //then this value will be placed into the current position and the value in the current position
                //will be moved to the next position (switch places)
                //System.out.println("J: " + j + " " + kundenliste[j].getCustLastName() + "--- minPos: " + minPos + " " + kundenliste[minPos].getCustLastName() + " --- RESULT: " + (kundenliste[j].getCustLastName().compareTo(kundenliste[minPos].getCustLastName())<0));
                if (kundenliste[j].getCustLastName().compareTo(kundenliste[minPos].getCustLastName()) < 0) {
                    //System.out.println("J: " + j + " " + kundenliste[j].getCustLastName() + "--- minPos: " + minPos + " " + kundenliste[minPos].getCustLastName() + " --- RESULT: " + kundenliste[j].getCustLastName().compareTo(kundenliste[minPos].getCustLastName()));
                    minPos = j;
                    min = kundenliste[minPos];
                    //System.out.println("An minPos steht jetzt : minPos-" + i + " - " + kundenliste[minPos].getCustLastName());
                }
            }
            // Swap next array element with element at current position of outer loop
            if (minPos != i) {
                kundenliste[minPos] = kundenliste[i];
                kundenliste[i] = min;
                //System.out.println(kundenliste[i].getCustLastName() + ", "+ kundenliste[i].getCustFirstName() + " wurde an position " + i + " gesetzt!");
            }
        }
        return kundenliste;
       }

    public static Kunde[] selectionSort(Kunde[] kundenliste) {
        //https://www.happycoders.eu/de/algorithmen/selection-sort/
        //https://www.happycoders.eu/de/java/comparator-comparable-compareto/

        int length = kundenliste.length;
        // Outer loop, to divide the array elements from unsorted to sorted till no unsorted elements are left
        for (int i = 0; i < length - 1; i++) {
            // Inner loop to search the smallest element (by last name of Kunde) in the remaining array
            int minPos = i;
            Kunde min = kundenliste[minPos];
            for (int j = i + 1; j < length; j++) {
                //If the next array value is smaller than the value in the current position
                //then this value will be placed into the current position and the value in the current position
                //will be moved to the next position (switch places)
                if (kundenliste[j].getCustLastName().compareTo(kundenliste[minPos].getCustLastName()) < 0) {
                    minPos = j;
                    min = kundenliste[minPos];
                    //If the next customer and the current customer have the same name, then sort by firstname
                } else if(kundenliste[j].getCustLastName().equals(kundenliste[minPos].getCustLastName())){
                    if(kundenliste[j].getCustFirstName().compareTo(kundenliste[minPos].getCustFirstName()) < 0){
                        minPos = j;
                        min = kundenliste[minPos];
                    }
                }
            }
            // Swap next array element with element at current position of outer loop
            if (minPos != i) {
                kundenliste[minPos] = kundenliste[i];
                kundenliste[i] = min;
            }
        }
        return kundenliste;
    }
}
