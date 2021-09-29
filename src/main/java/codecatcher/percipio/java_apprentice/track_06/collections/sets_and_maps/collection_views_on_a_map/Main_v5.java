package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.collection_views_on_a_map;

import java.util.HashMap;
import java.util.Map;

public class Main_v5 {

    public static void main(String[] args) {

        Map<Integer, String> moviesMap = new HashMap<>();

        System.out.println("**** Any number of nulls allowed in values");

        moviesMap.put(1202, "Titanic");
        moviesMap.put(1203, null);
        moviesMap.put(1501, "Back to the Future");
        moviesMap.put(1884, "The Godfather");
        moviesMap.put(2932, "Casablanca");
        moviesMap.put(6929, null);

        for (Map.Entry<Integer, String> entry : moviesMap.entrySet()) {
            System.out.format("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

        // Run

        System.out.println("**** The key can be null as well, considered unique");

        moviesMap.put(null, "Jaws");

        for (Map.Entry<Integer, String> entry : moviesMap.entrySet()) {
            System.out.format("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

        // Run

        System.out.println("**** Only one null key allowed in any map");

        moviesMap.put(null, "The Godfather II");

        for (Map.Entry<Integer, String> entry : moviesMap.entrySet()) {
            System.out.format("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

        // Run
    }
}
