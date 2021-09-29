package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.collection_views_on_a_map;

import java.util.*;

public class Main_v8 {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<Integer, String>();

        System.out.println("hashMap instanceof HashMap " + (hashMap instanceof HashMap));
        System.out.println("hashMap instanceof Map " + (hashMap instanceof Map));

        // Run

        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        System.out.println("\nlinkedHashMap instanceof LinkedHashMap " +
                (linkedHashMap instanceof LinkedHashMap));
        System.out.println("linkedHashMap instanceof HashMap " +
                (linkedHashMap instanceof HashMap));
        System.out.println("linkedHashMap instanceof Map " +
                (linkedHashMap instanceof Map));

        // Run

        Map<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println("\ntreeMap instanceof TreeMap " + (treeMap instanceof TreeMap));
        System.out.println("treeMap instanceof SortedMap " + (treeMap instanceof SortedMap));
        System.out.println("treeMap instanceof Map " + (treeMap instanceof Map));
    }
}
