package wildcodeschool.quests.Collection02.ComparableAndComparator;

import java.util.Comparator;

public class Hero implements Comparable <Hero> {

    // attributes
    private String name;
    private int age;

    // Constructors
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

   // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Hero o) {
        return this.name.compareTo(o.name);
    }
}