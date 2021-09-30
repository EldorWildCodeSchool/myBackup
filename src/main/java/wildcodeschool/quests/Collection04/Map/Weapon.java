package wildcodeschool.quests.Collection04.Map;

public class Weapon implements Comparable<Weapon> {

    private String name;

    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Weapon o) {
        return this.name.compareTo(o.name);
    }
}