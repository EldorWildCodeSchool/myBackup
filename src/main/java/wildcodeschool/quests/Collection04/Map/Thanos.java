package wildcodeschool.quests.Collection04.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);

        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet

        // Solution with "local" comparator instead of an override of compareTo-method
        // from the interface Comparable in class Hero
        /*
        Comparator compHero = new Comparator<Hero>() {
            @Override
            public int compare(Hero o1, Hero o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Map<Hero, Flower> party = new TreeMap<>(compHero);
        */

        Map<Hero, Flower> party = new TreeMap<>();
        party.put(hulk, lily);
        party.put(blackWidow, violet);
        party.put(captainAmerica, lily);
        party.put(thor, rose);
        party.put(vision, tulip);
        party.put(scarletWitch, rose);
        party.put(doctorStrange, violet);

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println("Is `begonia` contained in the TreeMap? \t Result: " + party.containsValue(begonia));
        System.out.println("Is `rose` contained in the TreeMap? \t Result: " + party.containsValue(rose));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for(Hero hero : party.keySet()){
            /*
            get(Object key):
            Params: key – the key whose associated value is to be returned
            Returns: the value to which the specified key is mapped, or null if this map contains no mapping for the key
            Remark ER: Es wird also über die Referenz des Schlüssels (Key/hero) die Referenz auf den Wert (Value/flower) geholt
            und der Variablen "flower" zugewiesen. Durch diese Referenz kann auf die Methode "getName" des Objektes des Typs Flower
            in der Iteration der for each-Schleife aufgelöst werden.
            Da musste ich doch länger drüber nachdenken, obwohl total logisch ;-)
            */
            Flower flower = party.get(hero);
            System.out.println(flower.getName() + "\t (belongs to " + hero.getName() + ")");
        }
    }
}