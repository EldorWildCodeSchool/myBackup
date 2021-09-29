package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.comparable_comparator_on_treeset;

import java.util.*;

public class Main_v2 {

    public static void main(String[] args) {

        Integer[] integersArray = new Integer[] {3300, 400, 100, 700, 900, 600};

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(integersArray));

        // Run

        System.out.println("\nOrder of integers in a TreeSet (natural order)");

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

        // Run

        treeSet.add(null);

        // Run - cannot add null values to a tree set as null is not comparable
    }
}
