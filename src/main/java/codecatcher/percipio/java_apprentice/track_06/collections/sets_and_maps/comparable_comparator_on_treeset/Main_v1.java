package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.comparable_comparator_on_treeset;

import java.util.*;

public class Main_v1 {

    public static void main(String[] args) {

        String[] carsArray = new String[] {"Volvo", "BMW", "Honda", "Audi", "Mercedes"};

        Set<String> hashSet = new HashSet<>(Arrays.asList(carsArray));
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(carsArray));
        Set<String> treeSet = new TreeSet<>(Arrays.asList(carsArray));

        System.out.println("Order of car names in a HashSet (random order)");

        for (String name : hashSet) {
            System.out.println(name);
        }


        System.out.println("\nOrder of car names in a LinkedHashSet (insertion order)");

        for (String name : linkedHashSet) {
            System.out.println(name);
        }

        // Run

        System.out.println("\nOrder of car names in a TreeSet (natural order)");

        for (String name : treeSet) {
            System.out.println(name);
        }

        // Run
    }
}
