package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.collection_views_on_a_map;

import java.util.HashMap;
import java.util.Map;

public class Main_v7 {

    public static void main(String[] args) {

        Map<Movie2, Float> moviesMap = new HashMap<>();

        System.out.println("**** Keys can be custom objects");

        moviesMap.put(new Movie2("Titanic", "Leonardo DiCaprio"), 8.8f);
        moviesMap.put(new Movie2("Back to the Future", "Michael J. Fox"), 8.3f);
        moviesMap.put(new Movie2("The Godfather", "Al Pacino"), 9.3f);
        moviesMap.put(new Movie2("Casablanca", "Humphrey Bogart"), 8.9f);

        for (Map.Entry<Movie2, Float> entry : moviesMap.entrySet()) {
            System.out.format("Key: %s, Value: %.1f\n", entry.getKey(), entry.getValue());
        }

        System.out.println();

        // Run

        System.out.println("**** Duplicate entries for the same movie");

        Movie2 anotherGodfather = new Movie2("The Godfather", "Al Pacino");

        moviesMap.put(anotherGodfather, 5.4f);

        for (Map.Entry<Movie2, Float> entry : moviesMap.entrySet()) {
            System.out.format("Key: %s, Value: %.1f\n", entry.getKey(), entry.getValue());
        }

        // Run

    }
}
