package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.collection_views_on_a_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main_v2 {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<Integer, String>();

        System.out.println("hashMap instanceof HashMap: " + (hashMap instanceof HashMap));
        System.out.println("hashMap instanceof Map: " + (hashMap instanceof Map));

        // Run

        System.out.println("hashMap instanceof Collection: " + (hashMap instanceof Collection));
        System.out.println("hashMap instanceof Iterable: " + (hashMap instanceof Iterable));

        // Run
    }
}
