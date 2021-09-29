package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.collection_views_on_a_map;

import java.util.HashMap;
import java.util.Map;

public class Main_v6 {

    public static void main(String[] args) {

        Map<Integer, Movie> moviesMap = new HashMap<>();

        System.out.println("**** Values can be custom objects");

        moviesMap.put(1202, new Movie("Titanic", "Leonardo DiCaprio"));
        moviesMap.put(1501, new Movie("Back to the Future", "Michael J. Fox"));
        moviesMap.put(1884, new Movie("The Godfather", "Al Pacino"));
        moviesMap.put(2932, new Movie("Casablanca", "Humphrey Bogart"));

        for (Map.Entry<Integer, Movie> entry : moviesMap.entrySet()) {
            System.out.format("Key: %d, Value: %s\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

        // Run

    }
}
