package wildcodeschool.quests.Collection02.ComparableAndComparator;

import java.util.Comparator;

public class Hero implements Comparable<Hero> {

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // By standard, all heroes should be sorted by the attribute name
    @Override
    public int compareTo(Hero o){
        // TODO LINK: https://www.happycoders.eu/de/java/comparator-comparable-compareto/
        // TODO LINK: https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html
        // Returns a value less than 0 if this.age comes before h.age after numerical sorting;
        // Returns 0 if this.age and h.age are the same;
        // Returns a value greater than 0 if this.age comes after h.age after numerical sorting.

        return this.name.compareTo(o.name);

        //Example for a compareTo-method on the attribute age which is integer
        // Iterative (naiv) code
        /*if (this.age < o.age) {
            return -1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return 1;
        }*/

        // Pretty cool stacked ternary operation
        //return this.age < o.age ? -1 : (this.age == o.age ? 0 : 1);
    }

   // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}