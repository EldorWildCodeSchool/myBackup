package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.collection_views_on_a_map;

import java.util.HashMap;
import java.util.Map;

public class Main_v3 {

    public static void main(String[] args) {

        Map<Integer, String> actorsMap = new HashMap<Integer, String>();

        actorsMap.put(1001, "Tom Hanks");
        actorsMap.put(1002, "Will Smith");
        actorsMap.put(1003, "Bruce Willis");

        System.out.println("Actors: " + actorsMap);
        System.out.println();

        // Run

        System.out.println("***** Adding elements");

        actorsMap.put(1004, "Chris Evans");
        actorsMap.put(1005, "Brad Pitt");

        System.out.println("Actors: " + actorsMap);
        System.out.println();

        // Run

        System.out.println("***** Retrieving elements");

        System.out.format("Key: %s, Value: %s\n", 1003, actorsMap.get(1003));
        System.out.format("Key: %s, Value: %s\n", 1001, actorsMap.get(1001));

        System.out.format("Key: %s, Value: %s\n", 1008, actorsMap.get(1008));

        System.out.println("Actors: " + actorsMap);
        System.out.println();

        // Run

        System.out.println("***** Deleting elements");
        System.out.println("Actors (original): " + actorsMap);

        actorsMap.remove(1001);
        actorsMap.remove(1003);

        System.out.println("Actors: " + actorsMap);
        System.out.println();

        // Run

        System.out.println("***** Updating elements");
        System.out.println("Actors (original): " + actorsMap);

        actorsMap.put(1001, "Aamir Khan");
        actorsMap.put(1005, "Amitabh Bachchan");

        System.out.println("Actors: " + actorsMap);
        System.out.println();

        // Run

    }
}
