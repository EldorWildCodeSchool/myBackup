package codecatcher.percipio.java_apprentice.track_06.collections.sets_and_maps.collection_views_on_a_map;

public class Movie {

    private String name;
    private String actor;

    public Movie(String name, String actor) {
        this.name = name;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public String getActor() {
        return actor;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + actor + "}";
    }
}
