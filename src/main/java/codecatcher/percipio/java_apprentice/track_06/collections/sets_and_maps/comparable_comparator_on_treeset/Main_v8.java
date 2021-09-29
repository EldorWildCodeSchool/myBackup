package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.comparable_comparator_on_treeset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main_v8 {

    public static void main(String[] args) {

        Comparator<String> descendingOrderComparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        String[] carsArray = new String[] {"Volvo", "BMW", "Honda", "Audi", "Mercedes"};
        SortedSet<String> treeSet = new TreeSet<>(descendingOrderComparator);

        treeSet.addAll(Arrays.asList(carsArray));

        for (String name : treeSet) {
            System.out.println(name);
        }


        // Run
    }
}
