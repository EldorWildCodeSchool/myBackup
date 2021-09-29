package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.comparable_comparator_on_treeset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main_v4 {

    public static void main(String[] args) {

        SortedSet<String> vowelSet = new TreeSet<>();

        vowelSet.add("A");
        vowelSet.add("E");
        vowelSet.add("I");
        vowelSet.add("O");
        vowelSet.add("U");

        System.out.println("Vowels are: " + vowelSet);

        System.out.println("First vowel: " + vowelSet.first());
        System.out.println("Last vowel: " + vowelSet.last());

        System.out.println();

        // Run

        System.out.println("Vowels which come before I: " + vowelSet.headSet("I"));
        System.out.println("Vowels which come after I (includes I): " + vowelSet.tailSet("I"));

        System.out.println();

        // Run

        System.out.println("Vowels which comes between E and U (includes E): " + vowelSet.subSet("E", "U"));

        System.out.println();

        // Run
    }
}
