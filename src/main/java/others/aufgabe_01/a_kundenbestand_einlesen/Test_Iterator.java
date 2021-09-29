package others.aufgabe_01.a_kundenbestand_einlesen;


import java.util.ArrayList;
import java.util.Iterator;

public class Test_Iterator {
    // Java code to illustrate iterator()
        public static void main(String[] args)
        {
            // Create and populate the list
            ArrayList<String> list
                    = new ArrayList<>();

            list.add("Geeks");
            list.add("for");
            list.add("Geeks");
            list.add("is");
            list.add("a");
            list.add("CS");
            list.add("Students");
            list.add("Portal");

            // Displaying the list
            System.out.println("The list is: \n"
                    + list);

            // Create an iterator for the list
            // using iterator() method
            Iterator<String> iter
                    = list.iterator();

            // Displaying the values after iterating
            // through the list
            System.out.println("\nThe iterator values"
                    + " of list are: ");
            while (iter.hasNext()) {
                System.out.print(iter.next() + " ");
            }
        }
}
